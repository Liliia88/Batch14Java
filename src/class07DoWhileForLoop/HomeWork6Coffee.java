package class07DoWhileForLoop;

import java.util.Scanner;

public class HomeWork6Coffee {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double price = 6;
		double pay = 0;

		System.out.println("Please pay for a coffee");
		pay = scanner.nextDouble();

		while (pay != price) {

			if (pay > price) {
				System.out.println("You need give less money");
			} else if (pay < price) {
				System.out.println("You need give more money");

			}
			System.out.println("Please pay for a coffee");
			pay = scanner.nextDouble();
		}
	
			System.out.println("Please enjoy your coffee!");

			System.out.println("----------------------------------");
			
			
			
		scanner.close();
	}
}
