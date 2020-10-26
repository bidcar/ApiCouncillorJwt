package councillor.jwt.api.controller;

import councillor.jwt.api.entity.*;
import councillor.jwt.api.service.api.*;
import councillor.jwt.api.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class CatalogController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @Autowired
    private PersonTypeServiceAPI personTypeServiceAPI;

    @Autowired
    private PersonServiceAPI personServiceAPI;

    @Autowired
    private DemographicdataServiceAPI demographicdataServiceAPI;

    @Autowired
    private VehicleServiceAPI vehicleServiceAPI;

    @Autowired
    private QuotationServiceAPI quotationServiceAPI;


    @GetMapping("/")
    public String welcome() {
        return "Bienvenido a la api de Concesionarios!!";

    }

    @GetMapping(value = "/all")
    public List<Persona> getAll() {
        return personaServiceAPI.getAll();
    }

    @GetMapping(value = "/allServiceType")
    public List<Persontype> allServiceType() {
        List<Persontype> result = personTypeServiceAPI.getAll();
        return result;
    }

/*    @PostMapping(value = "/deleteServiceType")
    public ResponseEntity<String> deleteServiceType(@RequestBody Persontype persontype) {
        personTypeServiceAPI.delete(persontype.getPersonTypeId());
        return new ResponseEntity<String>("Registro eliminado", HttpStatus.OK);
    }*/

    @PostMapping(value = "/saveServiceType")
    public ResponseEntity<Persontype> saveServiceType(@RequestBody Persontype persontype) {
        Persontype obj = personTypeServiceAPI.save(persontype);
        return new ResponseEntity<Persontype>(obj, HttpStatus.OK);
    }

    @PostMapping(value = "/savePerson")
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        Person obj = personServiceAPI.save(person);
        return new ResponseEntity<Person>(obj, HttpStatus.OK);
    }

    @PostMapping(value = "/saveDemographicData")
    public ResponseEntity<Demographicdata> saveDemographicData(@RequestBody Demographicdata demographicdata) {
        Demographicdata obj = demographicdataServiceAPI.save(demographicdata);
        return new ResponseEntity<Demographicdata>(obj, HttpStatus.OK);
    }

    @PostMapping(value = "/saveVehicle")
    public ResponseEntity<Vehicle> saveVehicle(@RequestBody Vehicle vehicle) {
        Vehicle obj = vehicleServiceAPI.save(vehicle);
        return new ResponseEntity<Vehicle>(obj, HttpStatus.OK);
    }

    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }

    @PostMapping(value = "/saveQuotation")
    public ResponseEntity<Quotation> saveQuotation(@RequestBody Quotation quotation) {
        quotation.setDatecreated(convertToDateViaSqlDate(LocalDate.now()));

        Quotation obj = quotationServiceAPI.save(quotation);
        return new ResponseEntity<Quotation>(obj, HttpStatus.OK);
    }

    @PostMapping(value = "/NewQuotation")
    public ResponseEntity<ResponseQuotation> NewQuotation(@RequestBody RequestQuotation requestQuotation) {

        //Save vehicle
        Vehicle objVehicle = vehicleServiceAPI.save(requestQuotation.getVehicle());

        //Save client
        Person objClient = personServiceAPI.save(requestQuotation.getClient());

        //Save demographic data
        Demographicdata demographicdata = requestQuotation.getDemographicdata();
        demographicdata.setUserid(objClient.getUserid());
        Demographicdata objDemographic = demographicdataServiceAPI.save(demographicdata);

        //Save Agent
        Person objAgent = personServiceAPI.save(requestQuotation.getAgent());

        Quotation quotation = requestQuotation.getQuotation();
        quotation.setDatecreated(convertToDateViaSqlDate(LocalDate.now()));
        quotation.setClientid(objClient.getUserid());
        quotation.setAgentsalesid(objAgent.getUserid());
        quotation.setVehicleid(objVehicle.getVehicleid());

        Quotation objQuotation = quotationServiceAPI.save(quotation);
        String obj = objQuotation.getQuotationid().toString();
        ResponseQuotation response = new ResponseQuotation();
        response.setId(obj);
        response.setMessage("Cotización exitosa");
        return new ResponseEntity<ResponseQuotation>(response, HttpStatus.OK);
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }

    @PostMapping(value = "/Between")
    public List<Quotation> Between(@RequestBody RequestReports requestReports) throws ParseException {
        List<Quotation> result = quotationServiceAPI.getAll();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Date start = null;
        Date end = null;
        start = sdf.parse(requestReports.getStartdate());
        end = sdf.parse(requestReports.getEnddate());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        start = calendar.getTime();

        calendar.setTime(end);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        end = calendar.getTime();

        Date finalEnd = end;
        Date finalStart = start;
        List<Quotation> filter =  result.stream()
                .filter(dates -> dates.getDatecreated().after(finalStart)
                        && dates.getDatecreated().before(finalEnd)).collect(Collectors.toList());
        return filter;

    }

}
