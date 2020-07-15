package by.epamtc.jwdmay2020.dziadkouskaya.task05.service.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.ApplienceName;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		boolean result = false;
		String applienceName = criteria.getGroupSearchName().toUpperCase();

		List<ApplienceName> namesList = Arrays.asList(ApplienceName.values());

		List<String> stringList = new ArrayList();

		for (ApplienceName name : namesList) {
			stringList.add(name.toString());
		}

		if (stringList.contains(applienceName)) {
			result = true;
		}

		return result;
	}

	public static boolean viewValidator(List<Appliance> list) {
		boolean result = true;

		if ( list == null || list.size() == 0) {
			result = false;
		}
		return result;
	}
}
