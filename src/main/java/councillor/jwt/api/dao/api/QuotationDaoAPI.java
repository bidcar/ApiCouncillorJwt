package councillor.jwt.api.dao.api;

import councillor.jwt.api.entity.Person;
import councillor.jwt.api.entity.Quotation;
import org.springframework.data.repository.CrudRepository;

public interface QuotationDaoAPI extends CrudRepository<Quotation, Integer> {

}
