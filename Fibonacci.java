package com.hexanika.Puzzling;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int jNumber = 20;
       int jFirst  = 0;
	   int jSecond = 1;
	   int jThird = 0;
	   
	   System.out.println(jThird);
	   
       for(int i=0; i<=jNumber; i++){
    	   
    	   jThird = jFirst + jSecond;
    	   jFirst =  jSecond;
    	   jSecond =  jThird;
       }
       System.out.println(jThird);
       int jfact =  fact(jNumber);
       System.out.println(jfact);
       
	}
	
	public static int fact(int jNumber) {
		 if(jNumber >= 1) {
			return (fact(jNumber - 1) + fact(jNumber - 2));
		}else {
			return 1;
		} 
	}

}
