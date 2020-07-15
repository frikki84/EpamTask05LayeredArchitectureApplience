package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

public class Oven extends Appliance {
	public static final String OVEN_NAME = "oven";

	private int powerConsumptation;

	private int weight;

	private int capacity;

	private double depth;

	private double height;

	private double width;

	{
		setApplienceName(OVEN_NAME);
	}

	public Oven() {

	}

	public Oven(int powerConsumptation) {

		this.powerConsumptation = powerConsumptation;

	}

	public Oven(int powerConsumptation, int weight, int capacity, double depth, double height, double width) {

		this.powerConsumptation = powerConsumptation;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumptation() {
		return powerConsumptation;
	}

	public void setPowerConsumptation(int powerConsumptation) {
		this.powerConsumptation = powerConsumptation;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Oven [powerConsumptation=" + powerConsumptation + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

}
