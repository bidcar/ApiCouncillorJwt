package councillor.jwt.api.dao.api;

import councillor.jwt.api.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDaoAPI extends CrudRepository<Person, Integer> {

}
