package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;


public class Speakers extends Appliance {
	public static final String SPEAKERS_NAME = "Speakers";

	private int powerConsumption;

	private int speakersNumber;

	private String freaquenceRange;

	private int cordLength;

	{
		setApplienceName(SPEAKERS_NAME);
	}

	public Speakers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Speakers(int powerConsumption, int speakersNumber, String freaquenceRange, int cordLength) {
		super();
		this.powerConsumption = powerConsumption;
		this.speakersNumber = speakersNumber;
		this.freaquenceRange = freaquenceRange;
		this.cordLength = cordLength;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getSpeakersNumber() {
		return speakersNumber;
	}

	public void setSpeakersNumber(int speakersNumber) {
		this.speakersNumber = speakersNumber;
	}

	public String getFreaquenceRange() {
		return freaquenceRange;
	}

	public void setFreaquenceRange(String freaquenceRange) {
		this.freaquenceRange = freaquenceRange;
	}

	public int getCordLength() {
		return cordLength;
	}

	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", speakersNumber=" + speakersNumber
				+ ", freaquenceRange=" + freaquenceRange + ", cordLength=" + cordLength + "]";
	}
}
