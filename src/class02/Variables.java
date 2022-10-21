package class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			String personal = "Liliia";
			String personal2= "Khusainova";
			char letter1='B';
			
			String location = "Lithia";
			String location2 = "Florida";
			long identify =7273588380L;
			
			System.out.println("My name is " + personal+ " and my last name is " +personal2); 
			System.out.println("I am " + letter1+ " student"); 
			System.out.println("I live in city " + location+ " and state " +location2); 
			System.out.println("And my phone number is " +identify); 
		
			location = "LA";
			location2 = "California";
		    identify =7273588381L;
			letter1='A';
			System.out.println("My name is " + personal+ " and my last name is " +personal2); 
			System.out.print("I am " + letter1+ " student"); 
			System.out.println(" and I moved to a new city " + location+ " and new state " +location2); 
			System.out.println("My new phone number is " +identify); 
			
			//Rules
			//1 cannot use keywords as identifiers (name, variable);
			//String new ="Hello"; -> error;
			
			//2 cannot have spaces in identifiers
			//String last name= "Smith"; ->error
			
			//3 identifiers cannot start with numbers;	
			//int 1number=123;
			//int number1=123; it's ok number can be anywhere after 1st character;
			
		// 4 identifiers cannot contain any special characters;
			//except $ or _
			//boolean hello!=true; ->error
			//double $price=9.98; it's ok
			// float _price1=1.99F;
			
			//Naming conventions
			//class should start with Uppercase and follow this name
			
			//String Weather="hot"; not preffered
			//String myweather="cold" preffered
			
			
			
			
			
	}

}
