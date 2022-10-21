package class08NestedForLoopBreakContin;

import java.util.Scanner;

public class TaskMoneySecondWayWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		Double amount;
		System.out.println("What do you want to buy?");
		String buyitem=scanner.next();
		System.out.println("What is the price of "+buyitem+"?");
		Double price=scanner.nextDouble();
		System.out.println("How much money do you have?");
		double total = 0;
		
		while (total != price) {
			  amount = scanner.nextDouble();
			  total+=amount;
			 if (total > price) {
				System.out.println("Here is you change "+(total-price));
			 break;
			 } 
			 else if (total < price) {
				System.out.println("You need to add "+(price-total));
			   }
		   }	   	    
			System.out.println("Thank you for shopping!");
			System.out.println("----------------------------");
			
	}

}
