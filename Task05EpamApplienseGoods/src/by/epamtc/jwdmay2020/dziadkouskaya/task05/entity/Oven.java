package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;

public class Oven extends Appliance {
	public static final String OVEN_NAME = "Oven";

	public Oven() {
		setApplienceName(OVEN_NAME);
		getFeatureMap().put(SearchCriteria.Oven.CAPACITY.toString(), null);
		getFeatureMap().put(SearchCriteria.Oven.DEPTH.toString(), null);
		getFeatureMap().put(SearchCriteria.Oven.HEIGHT.toString(), null);
		getFeatureMap().put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), null);
		getFeatureMap().put(SearchCriteria.Oven.WEIGHT.toString(), null);
		getFeatureMap().put(SearchCriteria.Oven.WIDTH.toString(), null);

	}
}
