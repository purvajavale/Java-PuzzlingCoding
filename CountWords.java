package com.hexanika.Puzzling;

import java.util.HashMap;
import java.util.Map;

/**
 * Count the words in java 
 *
 */
public class CountWords 
{
    public static void main( String[] args )
    {
		try {
			String sValue = "I am Purva Javale. I Have completed my BE in IT. I stay in Pune.";

			Map<String, Integer> objMap = new HashMap<String,Integer>();
			String[] sArrValues = sValue.split(" ");
			Integer jCount = 1;
			for (int i = 0; i < sArrValues.length; i++) {
				if (!objMap.containsKey(sArrValues[i])) {
					objMap.put(sArrValues[i].trim(),jCount);
				} else {
					objMap.put(sArrValues[i].trim(),objMap.get(sArrValues[i])+1);
				}
			}
			for (String s : objMap.keySet()) {
				System.out.println("Count:" + objMap.get(s) + " Word:" + s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
