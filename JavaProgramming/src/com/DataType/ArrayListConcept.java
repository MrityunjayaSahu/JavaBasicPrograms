package com.DataType;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("Hello");
		arrList1.add("World");

		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		arrList2.add(100);
		arrList2.add(200);

		// Values of ArrayList1
		for (int i = 0; i < arrList1.size(); i++) {
			System.out.println("Values of ArrayList1 is : " + arrList1.get(i));
		}

		System.out.println("=================================================");

		// Values of ArrayList2
		for (int j = 0; j < arrList2.size(); j++) {
			System.out.println("Values of ArrayList2 is : " + arrList2.get(j));
		}

		for (int i = 0; i < arrList1.size(); i++) {
			System.out.println("After Removal of Values from ArrList1 is : " + arrList1.remove(i));
		}

		arrList1.remove(0);
		System.out.println(arrList1);

		System.out.println("Size of arraylist is : " + arrList1.size());

		System.out.println(arrList1.contains("Hello"));
		System.out.println(arrList1.equals(arrList2));
		System.out.println(arrList1.isEmpty());
		System.out.println(arrList2.hashCode());
		System.out.println(arrList2.toString());
		System.out.println(arrList1.clone());
		System.out.println(arrList1.toString());
		System.out.println(arrList2.containsAll(arrList1));
		
		// Boolean Generics
		ArrayList<Boolean> arrBoolean = new ArrayList<Boolean>();
		arrBoolean.add(true);
		arrBoolean.add(false);
		arrBoolean.add(false);
		arrBoolean.add(true);
		
		for (int i = 0; i < arrBoolean.size(); i++) {
			System.out.println("All Array List Boolean Value's are : " + arrBoolean.get(i));
		}
		
		// Character Generics
		ArrayList<Character> arrChar = new ArrayList<Character>();
		arrChar.add('w');
		arrChar.add('q');
		
		for(int i = 0; i< arrChar.size(); i++) {
			System.out.println("Value of Charcter list are : " + arrChar.get(i));
		}
		
		
		ArrayList<Double> arrDouble =new ArrayList<Double>();
		arrDouble.add(123444.1234);
		arrDouble.add(12324343.32535);
		
		
		for(int i=0; i< arrDouble.size(); i++) {
			System.out.println("Values of Atrraylist double are : " + arrDouble.get(i));
		}
		
	}
}