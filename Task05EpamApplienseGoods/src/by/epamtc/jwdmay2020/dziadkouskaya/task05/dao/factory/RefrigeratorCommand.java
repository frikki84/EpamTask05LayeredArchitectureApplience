package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Laptop;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Refrigerator;

public class RefrigeratorCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		String productName = features[0];
		int powerConsumption = Integer.parseInt(features[2]);

		int weight = Integer.parseInt(features[4]);

		int freezerCapacity = Integer.parseInt(features[6]);

		int overalCapacity = Integer.parseInt(features[8]);

		int height = Integer.parseInt(features[10]);

		int width = Integer.parseInt(features[12]);
		
		Refrigerator refrigerator = new Refrigerator(powerConsumption, weight, freezerCapacity, overalCapacity, height, width);

		Appliance appliance = refrigerator;


		return appliance;
	}

}