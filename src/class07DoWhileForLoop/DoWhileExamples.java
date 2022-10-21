package class07DoWhileForLoop;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String answer;
		
		do {
		System.out.println("Did you get a job");
	    answer=sc.next();
	    
		} while(!answer.equals("yes"));
		System.out.println("Congratulations");
	}

}
