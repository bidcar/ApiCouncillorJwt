package councillor.jwt.api.service.impl;

import councillor.jwt.api.commons.GenericServiceImpl;
import councillor.jwt.api.dao.api.PersonaDaoAPI;
import councillor.jwt.api.entity.Persona;
import councillor.jwt.api.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

	@Autowired
	private PersonaDaoAPI personaDaoAPI;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDaoAPI;
	}

}
