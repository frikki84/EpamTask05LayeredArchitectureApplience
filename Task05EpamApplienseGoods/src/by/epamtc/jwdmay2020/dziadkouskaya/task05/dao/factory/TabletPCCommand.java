package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;

public class TabletPCCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		String productName = features[0];

		ApplienceFactory factory = ApplienceFactory.getInstance();
		Appliance appliance = factory.getTabletPC();

		appliance.setApplienceName(features[0]);


		for (int i = 1; i < features.length; i += 2) {
			appliance.getFeatureMap().put(features[i], features[i + 1]);

		}

		return appliance;
	}

}