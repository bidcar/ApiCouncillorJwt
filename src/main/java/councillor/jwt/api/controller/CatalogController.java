package councillor.jwt.api.controller;

import councillor.jwt.api.entity.AuthRequest;
import councillor.jwt.api.entity.Persontype;
import councillor.jwt.api.entity.Persona;
import councillor.jwt.api.service.api.PersonTypeServiceAPI;
import councillor.jwt.api.util.JwtUtil;
import councillor.jwt.api.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

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

    @PostMapping(value = "/saveServiceType")
    public ResponseEntity<Persontype> saveServiceType(@RequestBody Persontype persontype) {
        Persontype obj = personTypeServiceAPI.save(persontype);
        return new ResponseEntity<Persontype>(obj, HttpStatus.OK);
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
}
