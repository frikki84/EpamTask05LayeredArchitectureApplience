package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.ApplianceDAO;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory.ApplienceCommand;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory.ApplienceFactory;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory.ApplienceProvider;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.Appliance;
import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {

		List<Appliance> resultList = new ArrayList();

		List<String[]> allProducts = new ArrayList<>();

		String productName = criteria.getGroupSearchName().toUpperCase();

		Map<String, Object> productCriterias = criteria.getCriteria();
		
		

		String fileName = "resources/appliances_db.txt";

		BufferedReader reader = null;

		String line = "";

		try {
			reader = new BufferedReader(new FileReader(fileName));

			while (reader.ready()) {

				line = reader.readLine();

				String[] lineArray = ArrayCreation.splitStringToArray(line);

				lineArray = ArrayCreation.modifyStringToCommonViewWithoutSpaces(lineArray);

				if (lineArray[0].equals(productName)) {

					for (Map.Entry<String, Object> entry : productCriterias.entrySet()) {

						for (int i = 1; i < lineArray.length; i += 2) {

							if (lineArray[i].equals(entry.getKey().toString())) {

								if (lineArray[i + 1].equals(entry.getValue().toString().toUpperCase())) {
									allProducts.add(lineArray);

								}

							}
						}

					}
				}
			}

			
			List<String[]> finalList = ArrayChangion.findVariantSuitableForAllFeatures(allProducts,
					criteria.getCriteria());
			
			
			ApplienceFactory factory = ApplienceFactory.getInstance();

			ApplienceProvider provider = new ApplienceProvider();

			for (String[] item : finalList) {
				ApplienceCommand command = provider.takeApplienceCommand(item[0]);

				Appliance appliance = command.createApplience(item);

				resultList.add(appliance);
			}

		} finally

		{
			if (reader != null) {
				try {
					reader.close();

				} catch (Exception e) {
					System.err.println("Error!!!");
				}

			}
		}

		return resultList;

	}

}
