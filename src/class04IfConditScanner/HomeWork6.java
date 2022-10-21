package class04IfConditScanner;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner (System.in);
		System.out.println("How many years have you been working?");
		
		
		int workyears=scanner.nextInt();
		if (workyears>=5) {
			System.out.println("You are eligible for the bonus! What is your salary?");
			
			int salary=scanner.nextInt();
			if (salary>50000) {
				System.out.println("You are eligible for the bonus 5000!");
			} else {
				System.out.println("You are eligible for the bonus 3000!");
			}
		} else {
			System.out.println("Sorry, you are not eligible for the bonus:(");
		}
		

		scanner.close();
	}

}
