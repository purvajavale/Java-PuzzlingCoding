package com.hexanika.Puzzling;

/**
 * Reverse the string without loop and substring
 *
 */

public class ReserveString {

	public static void main(String[] args) {
		try {			
			String sValue = "6789";
			char[] cArr = sValue.toCharArray();
			char[] cArrResult = reverse(cArr,0, cArr.length - 1);	
			System.out.println(cArrResult);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static char[] reverse(char cArr[], int jIndex, int jValueSize) {
		char cTemp;
		cTemp = cArr[jIndex];
		cArr[jIndex] = cArr[jValueSize - jIndex];
		cArr[jValueSize - jIndex] = cTemp;
		if (jIndex == jValueSize / 2) {
			return cArr;
		}
		return reverse(cArr, jIndex + 1, jValueSize);
	}

}
