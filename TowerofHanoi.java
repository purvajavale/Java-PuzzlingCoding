package com.hexanika.Puzzling;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; 
        towerOfHanoi(n,"A", "C", "B"); 
	}
	
	public static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod) 
    { 
        if (n == 1) { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } else{
        	towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        	System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        	towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
        }
    } 

}
