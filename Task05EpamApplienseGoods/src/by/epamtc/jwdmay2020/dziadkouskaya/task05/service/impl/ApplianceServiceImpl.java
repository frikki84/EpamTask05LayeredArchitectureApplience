package by.epamtc.jwdmay2020.dziadkouskaya.task05.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.ApplianceDAO;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.DAOFactory;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.ApplienceName;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.Criteria;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.main.PrintApplianceInfo;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.service.ApplianceService;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		
		
		if (!Validator.criteriaValidator(criteria)) {
			
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
