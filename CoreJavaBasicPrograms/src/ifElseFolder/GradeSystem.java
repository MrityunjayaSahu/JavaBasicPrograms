package ifElseFolder;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
	/*	Score   Grade
		90-100   A
		80-89    B
		70-79    C
		50-69    D
		0-59     F */
		
		//int score;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Score : " );
		int score = input.nextInt();
		
		if(score >= 90 && score <= 100){
			System.out.println("A Grade");
		}else if(score >= 80 && score <= 89){
			System.out.println("B Grade");
		}else if(score >= 70 && score <= 79){
			System.out.println("C Grade");
		}else if(score >= 50 && score <= 69){
			System.out.println("D Grade");
		}else if(score >= 0 && score <= 59){
			System.out.println("F Grade");
		}
		
		
	}

}
