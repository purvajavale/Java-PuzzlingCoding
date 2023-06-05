package com.hexanika.Puzzling;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sArr[] = {20,13,40,45,10};
		int sLargest = sArr[0];
		int sSmallest = sArr[0];
		
		for (int i=0; i < sArr.length; i++){
			if(sArr[i] > sLargest){
				sLargest = sArr[i];
			}else if (sArr[i] < sSmallest){
				sSmallest =  sArr[i];
			}
			
		}
		System.out.println("Largest : " +  sLargest);
		System.out.println("Smallest : " +  sSmallest);
	}

}
