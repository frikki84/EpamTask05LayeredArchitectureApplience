package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

public class Refrigerator extends Appliance{
	public static final String REFRIGERATOR_NAME = "refrigerator";

	private int powerConsumption;

	private int weight;

	private int freezerCapacity;

	private int overalCapacity;

	private int height;

	private int width;

	{
		setApplienceName(REFRIGERATOR_NAME);
	}

	public Refrigerator() {
		super();

	}

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, int overalCapacity, int height,
			int width) {
		super();
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overalCapacity = overalCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezer_capacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOveralCapacity() {
		return overalCapacity;
	}

	public void setOveralCapacity(int overalCapacity) {
		this.overalCapacity = overalCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overalCapacity=" + overalCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	
}
