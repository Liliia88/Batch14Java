package class04IfConditScanner;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("What is your age?");
		 
		int agetodrive=scanner.nextInt();
		
		if (agetodrive>=18) {
			System.out.println("We will issue a drive licence to you");
		} else {
			System.out.println("We offer you to get a learners permit");
		}
		
		scanner.close();
		
	}

}
