package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;


import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.VacuumCleaner;

public class VacuumCleanerCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		int powerConsumption = Integer.parseInt(features[2]);

		String filterType = features[4];

		String bagType = features[6];

		String wandType = features[8];

		int motorSpeedRegulation = Integer.parseInt(features[10]);

		int cleaningWidth = Integer.parseInt(features[12]);

		VacuumCleaner cleaner = new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation,
				cleaningWidth);

		Appliance appliance = cleaner;
		
		System.out.println("Vac" + cleaner);
		
		return appliance;
	}

}
