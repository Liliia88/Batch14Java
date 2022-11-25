package class12StringMethodsInObjects;

public class StringDemo4EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		if(str==str3) {
			System.out.println("I found it");
		}
		/*
		 * equals checks if two Strings are exactly the same case
		 * equalsIgnoreCase checks if two Strings are exactly the same but does not care 
		 * about the case of letters
		 * 
		 * 
		 */
		if (str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsIgnoreCase");
		}
	}

}
