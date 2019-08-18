package com.DataType;

public class DataTypes {

	public static void main(String[] args) {
		//byte -  1 Byte
		//short -  2 Bytes
		//int -  4 Bytes
		//long -  8 Bytes
		//float -  4 Bytes
		//double - 8 Bytes
		//char -  2 Bytes
		//Boolean - 1 bit (true/false)
		
		byte b = 127;
		short s = 2345;
		int i = 1345676523;
		long l = 23445553;
		float f = 23.34f;
		double d = 23342355.43534554;
		
		// default boolean value is 'false'
		boolean bl = false;
		System.out.println(bl);
		
		// Character
		char c1 = 'a';
		char c2 = 'b';
		char c3 = 'c';
		System.out.println(c1 + c2 + c3);
		System.out.println("Value of c1 is : " + c1);
		System.out.println("Value of c1 is : " + (c1));
		System.out.println("Value of c2 is : " + c2);
		System.out.println("Value of c2 is : " + (c2));
		System.out.println("After concat of c1 and c2 is : " + c1 + c2);
		System.out.println("After concat of c2 and c1 is : " + c2 + c1);
		System.out.println("After concat of c1 and c2 is : " + (c1 + c2));
		System.out.println("After concat of c1 and c2 is : " + (c2 + c1));
		System.out.println("After concat of c1 and c2 is : " + (c1) + (c2));
		System.out.println("After concat of c1 and c2 is : " + c1 + (c2));
		System.out.println("After concat of c1 and c2 is : " + (c1) + c2);
		System.out.println("After concat of c1 and c2 is : " + (c2 + c1) + c3);
		
		//String Class
		String str = "as";
		String str1 = "100";
		String str2 = "200";
		int i1 = 10;
		int i2 = 20;
		double d1 = 23.456;
		System.out.println(str1 + str2 + 100 + str + 'a' + i1 + i2);
		System.out.println(str1 + str2 + 100 + str + 'a' + (i1 + i2));
		System.out.println((i1 + i2) + str1 + str2 + 100 + str + 'a');
		System.out.println((i1 + i2 + d1) + str1 + str2 + 100 + str + 'a');
		System.out.println((i1 + i2 + d1 + str) + str1 + str2 + 100 + str + 'a');
		System.out.println((str + i1 + i2 + d1) + str1 + str2 + 100 + str + 'a');
		System.out.println((str + (i1 + i2 + d1)) + str1 + str2 + 100 + str + 'a');
	}
}