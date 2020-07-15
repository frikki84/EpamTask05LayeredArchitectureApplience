package by.epamtc.jwdmay2020.dziadkouskaya.task05.main;

import java.io.IOException;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.Criteria;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.service.ApplianceService;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria("Laptop");
		// criteriaLaptop.add("BATTERY_CAPACITY", 1);
		criteriaLaptop.add("OS", "Linux");

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.printList(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria("Oven");
		criteriaOven.add("CAPACITY", 33);
		criteriaOven.add("DEPTH", 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.printList(appliance);

//////////////////////////////////////////////////////////////////

		Criteria criteriaRef = new Criteria("refrigerator");
		criteriaRef.add("OVERALL_CAPACITY", 300);

		appliance = service.find(criteriaRef);

		PrintApplianceInfo.printList(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaSpeakers = new Criteria("Speakers");
		criteriaSpeakers.add("NUMBER_OF_SPEAKERS", 2);

		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.printList(appliance);

//////////////////////////////////////////////////////////////////

		Criteria criteriaClener = new Criteria("VacuumCleaner");
		criteriaClener.add("POWER_CONSUMPTION", 1000);

		appliance = service.find(criteriaClener);

		PrintApplianceInfo.printList(appliance);

	}
}
