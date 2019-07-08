package ifElseFolder;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int checkEvenOrOdd = inputNumber.nextInt();
		
		if(checkEvenOrOdd % 2 == 0)
			System.out.println("Entered Number is : " + checkEvenOrOdd + " Even number.");
		else
			System.out.println("Entered Number is : " + checkEvenOrOdd + " Odd Number.");
	}
}
