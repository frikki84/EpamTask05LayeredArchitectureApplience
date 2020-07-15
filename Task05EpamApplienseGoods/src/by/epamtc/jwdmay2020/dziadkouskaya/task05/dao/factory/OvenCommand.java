package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Oven;

public class OvenCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		String productName = features[0];
		
		int powerConsumptation = Integer.parseInt(features[2]);

		int weight = Integer.parseInt(features[4]);

		int capacity = Integer.parseInt(features[6]);

		double depth = Double.parseDouble(features[8]);

		double height = Double.parseDouble(features[10]);

		double width = Double.parseDouble(features[12]);
		
		Oven oven = new Oven(powerConsumptation, weight, capacity, depth, height, width);
		
		Appliance appliance = oven;

		appliance.setApplienceName(features[0]);


		return appliance;
	}

}