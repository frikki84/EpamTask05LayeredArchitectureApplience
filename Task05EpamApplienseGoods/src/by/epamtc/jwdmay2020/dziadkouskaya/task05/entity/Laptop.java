package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;

public class Laptop extends Appliance{
	public static final String LAPTOP_NAME = "laptop";

	public Laptop() {
		
		setApplienceName(LAPTOP_NAME);
		getFeatureMap().put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), null);
		getFeatureMap().put(SearchCriteria.Laptop.CPU.toString(), null);
		getFeatureMap().put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(), null);
		getFeatureMap().put(SearchCriteria.Laptop.MEMORY_ROM.toString(), null);
		getFeatureMap().put(SearchCriteria.Laptop.OS.toString(), null);
		getFeatureMap().put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), null);

	}

	
	



}
