package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.TabletPC;

public class TabletPCCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		double batteryСapacity = Integer.parseInt(features[2]);

		int displayInch = Integer.parseInt(features[4]);

		int memoryRom = Integer.parseInt(features[6]);

		int flashMemoryCapacity = Integer.parseInt(features[8]);

		String color = features[10];

		TabletPC tabletPC = new TabletPC(batteryСapacity, displayInch, memoryRom, flashMemoryCapacity, color);
		
		Appliance appliance = tabletPC;
		
		return appliance;
	}

}