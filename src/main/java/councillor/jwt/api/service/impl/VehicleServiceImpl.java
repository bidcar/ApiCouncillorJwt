package councillor.jwt.api.service.impl;

import councillor.jwt.api.commons.GenericServiceImpl;
import councillor.jwt.api.dao.api.PersonDaoAPI;
import councillor.jwt.api.dao.api.VehicleDaoAPI;
import councillor.jwt.api.entity.Person;
import councillor.jwt.api.entity.Vehicle;
import councillor.jwt.api.service.api.PersonServiceAPI;
import councillor.jwt.api.service.api.VehicleServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl extends GenericServiceImpl<Vehicle, Integer> implements VehicleServiceAPI {

	@Autowired
	private VehicleDaoAPI vehicleDaoAPI;
	
	@Override
	public CrudRepository<Vehicle, Integer> getDao() {
		return vehicleDaoAPI;
	}

}
