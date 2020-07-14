package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayChangion {
	public static List<String[]> findVariantSuitableForAllFeatures(List<String[]> list, Map<String, Object> map) {

		List<String[]> resultList = new ArrayList<>();

		int expectedCounterValue = map.size();

		if (expectedCounterValue == 1) {
			resultList.addAll(list);
		} else {

			int counter = 1;

			for (int i = 0; i < list.size(); i++) {

				String[] littleArray = list.get(i);

				for (int j = i + 1; j < list.size(); j++) {

					String[] littleArray2 = list.get(j);

					if (Arrays.equals(littleArray, littleArray2)) {
						counter += 1;
					}
				}

				if (counter == expectedCounterValue) {
					resultList.add(littleArray);
				}
				counter = 1;
			}
		}
		return resultList;

	}
}
