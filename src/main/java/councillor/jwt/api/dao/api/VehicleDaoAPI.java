package councillor.jwt.api.dao.api;

import councillor.jwt.api.entity.Person;
import councillor.jwt.api.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleDaoAPI extends CrudRepository<Vehicle, Integer> {

}
