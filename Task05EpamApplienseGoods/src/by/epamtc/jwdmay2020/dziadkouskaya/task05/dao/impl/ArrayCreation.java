package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.impl;



public class ArrayCreation {
	public static String[] splitStringToArray(String string) {

		String regExForSplit = "[:=\\;\\,]";

		String[] stringToArray = string.split(regExForSplit);

		return stringToArray;

	}
	
public static String [] modifyStringToCommonViewWithoutSpaces (String [] array) {
		
		for (int i = 0; i < array.length; i ++) {
				array[i] = array[i].trim().toUpperCase();
		}
		
		
	
		return array;
	}

}
