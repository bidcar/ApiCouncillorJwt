package councillor.jwt.api.service.impl;

import councillor.jwt.api.commons.GenericServiceImpl;
import councillor.jwt.api.dao.api.QuotationDaoAPI;
import councillor.jwt.api.dao.api.VehicleDaoAPI;
import councillor.jwt.api.entity.Quotation;
import councillor.jwt.api.entity.Vehicle;
import councillor.jwt.api.service.api.QuotationServiceAPI;
import councillor.jwt.api.service.api.VehicleServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class QuotationServiceImpl extends GenericServiceImpl<Quotation, Integer> implements QuotationServiceAPI {

	@Autowired
	private QuotationDaoAPI quotetionDaoAPI;
	
	@Override
	public CrudRepository<Quotation, Integer> getDao() {
		return quotetionDaoAPI;
	}

}
