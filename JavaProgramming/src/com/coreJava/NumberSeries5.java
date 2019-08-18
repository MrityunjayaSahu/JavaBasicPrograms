package com.coreJava;

public class NumberSeries5 {

		/*
	    	1
	  	  2 1
		3 2 1
	  4 3 2 1
	5 4 3 2 1       
	*/
		
	public static void main(String[] args) {
		
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5-row; col++) {
				System.out.println(" ");
			}
			for (int k = 1; k <= row; k++) {
				System.out.println(row);
			}
			System.out.println();
		}
	}

}
