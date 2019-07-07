package ifElseFolder;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		 /*Leap Years are any year 
		 that can be evenly divided by 4.  
		 A year that is evenly divisible by 100 is a leap year 
		 only if it is also evenly divisible by 400.*/
		
		int LeapYear;
		Scanner inputYear = new Scanner(System.in);
		System.out.println("Entre a Year : ");
		LeapYear = inputYear.nextInt();
		
		if(LeapYear % 4 == 0){
			if(LeapYear % 100 == 0){
				if(LeapYear % 400 == 0){
					System.out.println("Year is : " + LeapYear + " Leap Year.");
				}else{
					System.out.println(LeapYear + " is not divisible by 400. So this year " + LeapYear + " is not leap year.");
				}
			}else{
				System.out.println(LeapYear + " is not divisible by 100. So this year " + LeapYear + " is not leap year.");
			}
		}else{
			System.out.println(LeapYear + " is not divisible by 4 .So this year " + LeapYear + " is not leap year.");
		}
	}
}
