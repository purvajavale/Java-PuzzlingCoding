package com.hexanika.Puzzling;

import java.util.HashMap;
import java.util.Map;

/**
 * Count the character occurenve in word/stmt.
 *
 */
public class CharOccurence {

	public static void main1(String[] args) {
		try {
			String sValue = "I am Purva Javale. I Have completed my BE in IT. I stay in Pune.";

			Map<Character, Integer> objMap = new HashMap<Character,Integer>();
			char[] sArrValues = sValue.toCharArray();
			Integer jCount = 1;
			for (int i = 0; i < sArrValues.length; i++) {
					if (!objMap.containsKey(sArrValues[i])) {
						objMap.put(sArrValues[i],jCount);
					} else {
						objMap.put(sArrValues[i],objMap.get(sArrValues[i])+1);
					}
				}
				for (Character c : objMap.keySet()) {
					System.out.println("Count:" + objMap.get(c) + " Word:" + c);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args)
    {
		String sValue = "I am Purva Javale. I Have completed my BE in IT. I stay in Pune.";
		char[] sArrValues = sValue.toCharArray();
		for (int i = 0; i < sArrValues.length; i++) {
			String sConversion = Character.toString(sArrValues[i]);
			int jCount = sValue.length() - sValue.replace(sConversion, "").length();
			System.out.println("Number of occurances of " +sConversion+" in = " + jCount);
		}
    }
}
