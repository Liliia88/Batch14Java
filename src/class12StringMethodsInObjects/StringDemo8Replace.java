package class12StringMethodsInObjects;

public class StringDemo8Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Batch 14 is good";
		/*
		 * replace method replaces one String with another in a string
		 * replaceAll it takes a pattern and replace all the characters that follow that pattern
		 * 
		 * 
		 */
		System.out.println(str.replace("good","Excellent"));
		System.out.println(str.replaceAll("[a-z]",""));
		
	}

}
