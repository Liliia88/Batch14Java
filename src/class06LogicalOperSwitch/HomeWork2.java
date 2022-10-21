package class06LogicalOperSwitch;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		String grade=scanner.nextLine();
		String choice;
		
		switch (grade) {
		
		case "A":
		    choice="Excellent";
		    break;
		case "B":
			choice="Good";
			break;
		case "C":
			choice="Average";
			break;
		default:
			choice="Not Acceptable";
			break;
		}
		System.out.println("Your grade is "+grade+" and you have "+choice+" score!");
				
				scanner.close();
	}

}
