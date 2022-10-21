package class04IfConditScanner;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have diploma or not, if yes please write down true, if not please write down false");
		
		boolean UniversityDegree=scanner.nextBoolean();
		
		if (UniversityDegree) {
			System.out.println("Congratulations! What is your gpa score?");
			
			double gpascore=scanner.nextDouble();
			
			if(gpascore>=3.5) {
				System.out.println("You are eligible for scholarship");	
			}else {
				System.out.println("You should study harder!");	
			}
			
		}
		else {
			System.out.println("You should have a degree");
		}
		
		scanner.close();
	}

}

