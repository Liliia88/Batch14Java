package class06LogicalOperSwitch;

import java.util.Scanner;

public class Task6Logical {

	public static void main(String[] args) {
		

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter quiz");
		double quiz=scanner.nextDouble();
		
		System.out.println("Please enter mid term");
		double midterm=scanner.nextDouble();
		
		System.out.println("Please enter final score");
		double finalscore=scanner.nextDouble();
		
		double averagescore=(quiz+midterm+finalscore)/3;
		String avg=null;
		if (averagescore>=90) {
			avg="A";
		} else if (averagescore>=70 && averagescore<90) {
			avg="B";
		}else if (averagescore>=50 && averagescore<70) {
			avg="C";
		} else if (averagescore<50) {
			avg="F";
		} else {
			System.out.println("Please enter valid score");
		
		}
		 System.out.println("Grade: "+avg);
		 
		 scanner.close();
	}

}
