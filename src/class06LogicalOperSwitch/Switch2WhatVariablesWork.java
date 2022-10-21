package class06LogicalOperSwitch;

public class Switch2WhatVariablesWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//matching cases must of same data type as a variable
		// no dublicate case in switch
		//
		
	char choice='Y';
	String answer;
	
	 switch(choice) {
	 
	 case 'Y':
		 answer="Yes";
		 break;
	 case 'N':
		 answer="No";
		 break;
	 case 'M':
		 answer="Maybe";
		 break;
	default:
		answer="Unknown";
		break;
	 } 
	 System.out.println(answer);
	
	 //Limitations of switch case
	 //switch cannot use logical operators, relational operators
	 // cannot work with boolean values
	 /* boolean boo=true;
	  * switch (boo)
	  * 
	  * cannot work with float/double, long and boolean
	  * 
	  *byte, short, int can work
	  */
	}
}
