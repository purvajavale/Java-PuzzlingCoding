package com.hexanika.Puzzling;

import java.util.ArrayList;

public class Duplicates {

	public static void main(String[] args) {
		int sArr[] = {20,13,40,45,10,10};
		ArrayList<Integer> iArrDuplicates = dupicateBruteForce(sArr);
		//ArrayList<Integer> iArrDuplicatesSorting = dupicateSorting(sArr);
		System.out.println(iArrDuplicates);
		
	}
	
	public static ArrayList<Integer> dupicateBruteForce(int[] jArr){
		
		ArrayList<Integer> iArr = new ArrayList<Integer>();
		for (int i = 0; i < jArr.length; i++) {
			for (int j = i+1; j < jArr.length; j++) {
				if (jArr[i] == jArr[j]) {
					System.out.println("Duplicate :" + jArr[i]);
					iArr.add(jArr[i]);
				}
			}
		}
		return iArr;
	}
	
	public static ArrayList<Integer> dupicateSorting(int[] jArr){
		
		ArrayList<Integer> iArr = new ArrayList<Integer>();
		for (int i = 0; i < jArr.length-1; i++) {
				if (jArr[i] == jArr[i+1]) {
					System.out.println("Duplicate :" + jArr[i]);
					iArr.add(jArr[i]);
				}
		}
		return iArr;
	}

}
