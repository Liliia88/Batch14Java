package class04IfConditScanner;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a credit card, if yes write down true, if not write down false.");
		Boolean cc=scanner.nextBoolean();
		
		if (cc) {
			System.out.println("What is the balance on the card?");
		
			int balance=scanner.nextInt();
			
			if (balance>1000) {
				System.out.println("You should pay off immediately");
			} else {
				System.out.println("You can spend more");
			}
		
		} else {
			System.out.println("We offer you to get one");
		}
		
		
		
		scanner.close();
	}

}
