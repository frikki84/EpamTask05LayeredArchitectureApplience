package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Speakers;

public class SpeakersCommand implements ApplienceCommand {

	public Appliance createApplience(String[] features) {

		
		int powerConsumption = Integer.parseInt(features[2]);

		int speakersNumber = Integer.parseInt(features[4]);

		String freaquenceRange = features[6];

		int cordLength = Integer.parseInt(features[8]);
		
		Speakers speakers = new Speakers(powerConsumption, speakersNumber, freaquenceRange, cordLength);

		Appliance appliance = speakers;

		return appliance;
	}

}
