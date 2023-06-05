package com.hexanika.Puzzling;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jNumber = 5;
		int jFirst = 1;

		for (int i = 1; i <= jNumber; i++) {
			jFirst = jFirst * i;
		}

		jFirst = fact(jNumber);

		System.out.println(jFirst);
	}

	public static int fact(int jNumber) {
		 if(jNumber >= 1) {
			return (jNumber * fact(jNumber - 1));
		}else {
			return 1;
		} 
	}

}
