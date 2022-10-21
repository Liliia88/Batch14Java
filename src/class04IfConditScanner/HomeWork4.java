package class04IfConditScanner;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner (System.in);
		System.out.println("What is your city?");
		
		String cityname=scanner.nextLine();
		System.out.println("What is the weather temperature?");
		
		int temp=scanner.nextInt();
		double convert=(temp-32)/1.8;
		
		System.out.println("The temperature in your city in C' is "+convert+".");
		

		scanner.close();
	}

}
