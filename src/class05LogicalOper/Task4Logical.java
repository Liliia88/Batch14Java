package class05LogicalOper;

import java.util.Scanner;

public class Task4Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the current time, use 24 hour format");
		
		int time=scanner.nextInt();
		if(time>=1 && time<=11 ) {
			 System.out.println("Morning");	
	} else if (time>=12 && time<=15 ){
		 System.out.println("Afternoon");	
	} else if (time>=16 && time<=20) {
		 System.out.println("Evening");	
	} else if (time>=21 && time<=24) {
		System.out.println("Night");	
	}
   
		
		System.out.println("Please enter the current time, use 24 hour format");
		
		int hour=scanner.nextInt();
		
		String timeOftheDay;
		
		if(hour>=1 && hour<=11 ) {
			timeOftheDay="Morning";	
	} else if (hour>=12 && hour<=15 ){
		timeOftheDay="Afternoon";	
	} else if (hour>=16 && hour<=20) {
		timeOftheDay="Evening";	
	} else if (hour>=21 && hour<=24) {
		timeOftheDay="Night";	
	} else {
		System.out.println("Wrong number is entered");
		timeOftheDay="Invalid";
	}
		System.out.println(timeOftheDay);
		
		
		
 scanner.close();
}
}
