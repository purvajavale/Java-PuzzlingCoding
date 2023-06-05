package com.hexanika.Puzzling;

public class Palindrome {

	public static void main(String[] args) {
		try {			
			String sValue = "isosi";
			boolean flag = isPalindrome(sValue);
			System.out.println(flag);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isPalindrome(String sValue){

        int i = 0, j = sValue.length() - 1; 
        while (i < j) { 
            if (sValue.charAt(i) != sValue.charAt(j)) {
                return false; 
            }
            i++; 
            j--; 
        } 
        return true; 
	}

}
