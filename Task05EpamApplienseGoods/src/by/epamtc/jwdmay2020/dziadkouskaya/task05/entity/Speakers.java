package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.SearchCriteria;

public class Speakers extends Appliance {
	public static final String SPEAKERS_NAME = "Speakers";

	public Speakers() {
		setApplienceName(SPEAKERS_NAME);
		getFeatureMap().put(SearchCriteria.Speakers.CORD_LENGTH.toString(), null);
		getFeatureMap().put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), null);
		getFeatureMap().put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), null);
		getFeatureMap().put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), null);

	}
}
