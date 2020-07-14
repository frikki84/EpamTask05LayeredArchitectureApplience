package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria.Laptop;

public class LaptopCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		String productName = features[0];

		ApplienceFactory factory = ApplienceFactory.getInstance();
		Appliance appliance = factory.getLaptop();

		appliance.setApplienceName(features[0]);


		for (int i = 1; i < features.length; i += 2) {
			appliance.getFeatureMap().put(features[i], features[i + 1]);

		}

		return appliance;
	}

}
