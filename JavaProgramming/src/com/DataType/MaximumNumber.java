package com.DataType;

public class MaximumNumber {

	/*
	 * int x = 100; int y = 200; int z = 300;
	 */
	
	public void compare(int x, int y,int z) {
		if(x>y && x>z)
			System.out.println("x is greatest number");
		else if(y>z)
			System.out.println("y is greatest number");
		else
			System.out.println("z is greatest number");
	}
	
	public static void main(String args[]) {
		MaximumNumber max = new MaximumNumber();
		max.compare(12300,6600,300);
	}
}
