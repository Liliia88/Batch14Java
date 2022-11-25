package class12StringMethodsInObjects;

public class StringDemo7IndexNumberSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am always confused";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		/*
		 * substring()gives you smaller string from a String we can start the starting part to this method 
		 * and it will return us the subString from that index
		 * 
		 */
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,11));
	}

}
