package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance{
	public static final String REFRIGERATOR_NAME = "Refrigerator";
	
	public Refrigerator() {
		setApplienceName(REFRIGERATOR_NAME);
		getFeatureMap().put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), null);
		getFeatureMap().put(SearchCriteria.Refrigerator.HEIGHT.toString(), null);
		getFeatureMap().put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), null);
		getFeatureMap().put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), null);
		getFeatureMap().put(SearchCriteria.Refrigerator.WEIGHT.toString(), null);
		getFeatureMap().put(SearchCriteria.Refrigerator.WIDTH.toString(), null);

		
	}
}
