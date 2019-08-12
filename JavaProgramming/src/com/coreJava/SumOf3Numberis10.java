package com.coreJava;

/**
 * @author Mrityunjay
 *
 */

public class SumOf3Numberis10 {

	public static void main(String[] args) {
		int sum, n=100;
		for(int i = 1;i <= n;i++){
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					sum = i + j + k;
					if(sum==10) {
						System.out.println("first no is : " + i + " , second no is : " + j + " , third no is : " + k);
						sum = i + j + k;
						System.out.println("Sum is : " + sum);
					}
				}
			}
		}
	}
}
