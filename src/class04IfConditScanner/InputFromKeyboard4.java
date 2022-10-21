package class04IfConditScanner;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve any Repl Assignments please enter true or false");
		
		boolean solveAnyRepls=scanner.nextBoolean();
		
		if(solveAnyRepls) {
			System.out.println("How many Repls you solved");
			int no0ReplsSolved=scanner.nextInt();
			
			if (no0ReplsSolved>=17)
			{
				System.out.println("you are doing great");
			} else if (no0ReplsSolved>10) {
				
				System.out.println("you are doing ok Please complete them as soon as possible");
				
				
			} else {
				
				System.out.println("you should solve some more repls");
				
			}	
				
		}
		else {
			
			System.out.println("They are very important to learn java please solve them");
		}
		scanner.close();
		
		
	}

}
