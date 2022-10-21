package class05LogicalOper;

import java.util.Scanner;

public class Task5Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=scanner.nextLine();
		
		String birthdaymonth=null;
        
		if(month.equals("March") || month.equals("April") || month.equals("May")) {
			
			birthdaymonth="Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			
			birthdaymonth="Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			birthdaymonth="Autumn";
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			birthdaymonth="Winter";
		}
		System.out.println("You were born in "+birthdaymonth);
		
  scanner.close();
}
}
