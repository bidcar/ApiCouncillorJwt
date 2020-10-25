package councillor.jwt.api.dao.api;

import councillor.jwt.api.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
