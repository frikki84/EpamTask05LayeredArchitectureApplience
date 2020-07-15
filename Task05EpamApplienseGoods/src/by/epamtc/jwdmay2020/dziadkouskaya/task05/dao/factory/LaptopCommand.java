package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Laptop;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;


public class LaptopCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		String productName = features[0];
		
		double powerCapacity = Double.valueOf(features[2]);

		String os = features[4];

		int memoryRom = Integer.valueOf(features[6]);

		int systemMemory = Integer.valueOf(features[8]);

		double cpu = Double.valueOf(features[10]);

		int displayInch = Integer.valueOf(features[12]);

		Laptop laptop = new Laptop(powerCapacity, os, memoryRom, systemMemory, cpu, displayInch);
	
	
		Appliance appliance = laptop;


		return appliance;
	}

}
