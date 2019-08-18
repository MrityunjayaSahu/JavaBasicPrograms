package com.DataType;

public class Increment {

	public static void main(String[] args) {
		/*
		 * int a = 1; int b = a++; System.out.println(a); // 2 System.out.println(b); //
		 * 1
		 * 
		 * System.out.println("======================================================");
		 * 
		 * int c = 7; int d = ++c; System.out.println(c); // First C = C + 1; // 8
		 * System.out.println(d); // Second d = value of C // 8
		 * 
		 * System.out.println("======================================================");
		 * 
		 * int m = 3; int n = m--; System.out.println(m); // 2 System.out.println(n); //
		 * 3
		 * 
		 * System.out.println("======================================================");
		 * 
		 * int o = 3; int p = --o; System.out.println(o); // 2 System.out.println(p); //
		 * 2
		 */		
		System.out.println("======================================================");
		
		int l = 10;
		int s = ++l + --l + l++ + ++l;
		System.out.println(l); // 12
		System.out.println(s); // 11
		
	}

}
