package councillor.jwt.api.service.impl;

import councillor.jwt.api.commons.GenericServiceImpl;
import councillor.jwt.api.dao.api.DemographicdataDaoAPI;
import councillor.jwt.api.dao.api.PersonDaoAPI;
import councillor.jwt.api.entity.Demographicdata;
import councillor.jwt.api.entity.Person;
import councillor.jwt.api.service.api.DemographicdataServiceAPI;
import councillor.jwt.api.service.api.PersonServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DemographicdataServiceImpl extends GenericServiceImpl<Demographicdata, Integer> implements DemographicdataServiceAPI {

	@Autowired
	private DemographicdataDaoAPI demographicdataDaoAPI;
	
	@Override
	public CrudRepository<Demographicdata, Integer> getDao() {
		return demographicdataDaoAPI;
	}

}
