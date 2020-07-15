package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

public class Laptop extends Appliance {
	public static final String LAPTOP_NAME = "laptop";

	private double powerCapacity;

	private String os;

	private int memoryRom;

	private int systemMemory;

	private double cpu;

	private int displayInch;

	public Laptop() {
		setApplienceName(LAPTOP_NAME);
		this.powerCapacity = 0;
		this.os = "";
		this.memoryRom = 0;
		this.systemMemory = 0;
		this.cpu = 0;

	}

	public Laptop(double powerCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInch) {
		setApplienceName(LAPTOP_NAME);
		this.powerCapacity = powerCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInch = displayInch;
	}

	public double getPowerCapacity() {
		return powerCapacity;
	}

	public void setPowerCapacity(double powerCapacity) {
		this.powerCapacity = powerCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public int getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(int displayInch) {
		this.displayInch = displayInch;
	}

	@Override
	public String toString() {
		return "Laptop [powerCapacity=" + powerCapacity + ", os=" + os + ", memoryRom=" + memoryRom + ", systemMemory="
				+ systemMemory + ", cpu=" + cpu + ", displayInch=" + displayInch + "]";
	}

}
