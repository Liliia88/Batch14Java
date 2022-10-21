package class07DoWhileForLoop;

import java.util.Scanner;

public class HomeWork6Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double price = 6;
		double pay = 0;

		do {
		System.out.println("Please pay for a coffee");
		pay = scanner.nextDouble();

		if (pay > price) {
				System.out.println("You need give less money");
			} else if (pay < price) {
				System.out.println("You need give more money");

			}
		
		} while (pay != price); 
		
		{
			System.out.println("Please enjoy your coffee");
			
		}
			
		scanner.close();
	}

}
