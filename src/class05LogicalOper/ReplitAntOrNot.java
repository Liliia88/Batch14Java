package class05LogicalOper;

import java.util.Scanner;

public class ReplitAntOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner=new Scanner(System.in);
		  
		  System.out.println("Please enter first string ");
		  String word1=scanner.nextLine();
		  System.out.println("Please enter second string ");
		  String word2=scanner.nextLine();
		  System.out.println("Please enter first number ");
		  int int1=scanner.nextInt();
		  System.out.println("Please enter second number ");
		  int int2=scanner.nextInt();
		  String result=null;

		  if (int1!=int2 && (!word1.equals(word2))){
		    result="NONE";
		  } 
		    else if (int1==int2 && word1.equals(word2)) {
		     result="AND";
		    
		  } else if (int1==int2 || word1.equals(word2)) {
		      result="OR";
		  } 
		  System.out.println("Your result is "+result);
		   
	}

}
