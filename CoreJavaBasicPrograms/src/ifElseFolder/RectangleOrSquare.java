package ifElseFolder;

import java.util.Scanner;

public class RectangleOrSquare {

	public static void main(String[] args) {
		
		// 1. Take values of length and breadth of a rectangle from user and check if it is square or not.
		//int length = 7;
		//int breadth = 9;
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int length = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter 2nd number : ");
		int breadth = input2.nextInt();
		
		if(length == breadth){
			System.out.println("Both Length : " + length + " and breadth are : " + breadth + " Equal. So it's Square");
		}else {
			System.out.println("Both Length : " + length + " and breadth are : " + breadth + " not Equal. So it's Rectangle.");
		}
		
	}

}
