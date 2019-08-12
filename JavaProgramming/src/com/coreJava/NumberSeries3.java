/**
 * 
 */
package com.coreJava;

/**
 * @author Mrityunjay
 *
 */
public class NumberSeries3 {

	/*
	         1
	       2 1
	     3 2 1
	   4 3 2 1
	 5 4 3 2 1       
	 */
	static int space = 1;
	
	public static void main(String[] args) {
		for (int row = 5; row >= 1; row--) {
			for (int col = 5; col >= space; col--) {
				System.out.print(col + " ");
			}
			space = space;
			System.out.println(" ");
		}
	}
}
