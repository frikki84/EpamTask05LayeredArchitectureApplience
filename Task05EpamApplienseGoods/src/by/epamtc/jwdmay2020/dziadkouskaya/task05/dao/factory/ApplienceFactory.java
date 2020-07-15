package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Laptop;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Oven;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Refrigerator;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Speakers;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.TabletPC;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.VacuumCleaner;

public class ApplienceFactory {

	private static final ApplienceFactory instance = new ApplienceFactory();

	private static Laptop laptop = new Laptop();

	private static Oven oven = new Oven();

	private static Refrigerator refrigerator = new Refrigerator();

	private static Speakers speakers = new Speakers();

	private static TabletPC tabletPC = new TabletPC();

	private static VacuumCleaner cleaner = new VacuumCleaner();

	public ApplienceFactory() {

	}

	public static ApplienceFactory getInstance() {
		return instance;
	}

	public static Laptop getLaptop() {
		return laptop;
	}

	public static Oven getOven() {
		return oven;
	}

	public static Refrigerator getRefrigerator() {
		return refrigerator;
	}

	public static Speakers getSpeakers() {
		return speakers;
	}

	public static TabletPC getTabletPC() {
		return tabletPC;
	}

	public static VacuumCleaner getCleaner() {
		return cleaner;
	}

}
