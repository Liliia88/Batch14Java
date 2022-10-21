package class04IfConditScanner;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the mortgage rate now?");
 
		double mortgageRate=scanner.nextDouble();
		
		if (mortgageRate>4.5) {
			System.out.println("I will not buy a house");
			 
		} else {
			System.out.println("I will consider buying a house. What is the price of the house?");
			
			double priceHouse=scanner.nextDouble();
			
			if (priceHouse>200.000) {
				System.out.println("I will take a loan. What amount of loan can I take?");
				double loanAmount=scanner.nextDouble();
				
				if (loanAmount<=200.000) {
					System.out.println("This loan amount can be approved!");
				
				} else {
					System.out.println("Sorry, we have to reject!");
				}
				
			
			} else {
				System.out.println("I will pay cash");
			}
			
		}
	   
		scanner.close();
		
	}
		
	}


