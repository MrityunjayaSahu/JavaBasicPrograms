package com.coreJava;


/**
 * @author Mrityunjay
 *
 */

public class NumberSeries2 {
/*
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
	*/
	
	public static void main(String[] args) {
		
		int space=5;
		
		for (int row = 1; row <= 5; row++) {
			
			for (int col = 1; col <= space; col++) {
				System.out.print(col + " ");
			}
			
			System.out.println();
			space = space-1;
		}
	}
}