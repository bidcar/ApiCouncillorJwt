package councillor.jwt.api.service.impl;

import councillor.jwt.api.commons.GenericServiceImpl;
import councillor.jwt.api.dao.api.PersonDaoAPI;
import councillor.jwt.api.entity.Person;
import councillor.jwt.api.service.api.PersonServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends GenericServiceImpl<Person, Integer> implements PersonServiceAPI {

	@Autowired
	private PersonDaoAPI personDaoAPI;
	
	@Override
	public CrudRepository<Person, Integer> getDao() {
		return personDaoAPI;
	}

}
