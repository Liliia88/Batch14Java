package class08NestedForLoopBreakContin;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double secretnum = 6;
		System.out.println("Guess a secret number");
		Double guessnum = scanner.nextDouble();
		
		while (guessnum != secretnum) {

			System.out.println("Guess a secret number");
			guessnum = scanner.nextDouble();
		}
	
			System.out.println("You wone!");

	}

}
