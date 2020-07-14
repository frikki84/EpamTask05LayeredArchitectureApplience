package by.epamtc.jwdmay2020.dziadkouskaya.task05.main;

import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.service.validation.Validator;

public class PrintApplianceInfo {

	public static void printList(List<Appliance> list) {
		if (!Validator.viewValidator(list)) {
			
			System.out.println("No such an applience");
			
		} else {
			for (Appliance item : list) {
				System.out.println(item);
			}
			System.out.println();

		}
	}

	public static void print(String msg) {
		System.out.println(msg);

	}

	// you may add your own code here

}
