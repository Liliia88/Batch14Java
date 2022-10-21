package class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * String concatenation helps us combine two strings together
		 * String concatenation helps us to combine string with any primitive data type tygether
		 * 
		 * 
		 */
		String firstName="Mina";
		String lastName="Henen";
		String fulName=firstName+" "+lastName;
		
		System.out.println(fulName);
		 int houseNo=15;
		 int apartmentNo=5;
		 String streetName="That street";
		 String city="New York";
		 String country="USA";
		 String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
		 System.out.println(fullAddress);
		
		 String incompleteAddress= houseNo+city;
		 
		 String step1="if we subtract 15 from 5 we get="+10; //result in string;
		 System.out.println(step1);
		 //it is not defined java does not understand what to do when we ask her to subtract
		 //String step2=step-5;
		 
		 System.out.println("if we subtract 10 from 5 we get="+(10-5)); 
		 
	}

}
