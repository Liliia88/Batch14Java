package class07DoWhileForLoop;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?");
		
		for (int i=1; i<=3; i++) {
		
		String answer=scanner.next();
		
		System.out.println("Good afternoon "+ answer);
		}
		
		
	}

}
