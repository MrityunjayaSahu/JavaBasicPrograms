package ifElseFolder;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an age : ");
		int PersonAge = input.nextInt();
		
		if(PersonAge >= 18){
			System.out.println("Person's age is : " + PersonAge + ". So eligible for Voting.");
		}else{
			System.out.println("Person's age is : " + PersonAge + ". So eligible for Voting.");
		}
		
	}

}
