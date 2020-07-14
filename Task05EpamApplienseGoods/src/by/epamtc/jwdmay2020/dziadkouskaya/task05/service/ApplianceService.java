package by.epamtc.jwdmay2020.dziadkouskaya.task05.service;

import java.io.IOException;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.Criteria;

public interface ApplianceService {	
	
	List <Appliance> find(Criteria criteria) throws IOException;
	
}
