package class11.GrProjArrays;

import java.util.Scanner;

public class GrProjTask2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What countries would you like to visit?");

		String[][] countries = { 
				{ "Mexico", "Mexico City" }, 
				{ "Australia", "Canberra" },
				{ "Argentina", "Buenos Aires" }, 
				{ "Brazil", "Brasilia" }, 
				{ "France", "Paris" } };

		String[] entercounts = new String[countries.length];

		for (int a = 0; a < entercounts.length; a++) {
			entercounts[a] = scanner.next();
			boolean find = false;
			
			for (int b = 0; b < countries.length; b++) {
				
				if (entercounts[a].equals(countries[b][0])) {
					System.out.println("The capital of " + entercounts[a] + " is " + countries[b][1]);
					find = true;
				}
			}  if(!find)
			{
				System.out.println("The capital of " + entercounts[a] + " is not valid");
			}
		}
		scanner.close();
	}
}
