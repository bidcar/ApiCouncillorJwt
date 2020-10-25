package councillor.jwt.api.service.impl;

import councillor.jwt.api.commons.GenericServiceImpl;
import councillor.jwt.api.dao.api.PersonTypeDaoAPI;
import councillor.jwt.api.entity.Persontype;
import councillor.jwt.api.service.api.PersonTypeServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonTypeServiceImpl extends GenericServiceImpl<Persontype, Integer> implements PersonTypeServiceAPI {

	@Autowired
	private PersonTypeDaoAPI personTypeDaoAPI;
	
	@Override
	public CrudRepository<Persontype, Integer> getDao() {
		return personTypeDaoAPI;
	}

}
