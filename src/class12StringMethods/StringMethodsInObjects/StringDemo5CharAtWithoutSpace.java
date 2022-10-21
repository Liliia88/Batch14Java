package class12StringMethods.StringMethodsInObjects;

public class StringDemo5CharAtWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love java programming";
		System.out.println(str.charAt(2));

		// primitive thats why we use '==' not equals.
		// charAt returns us the character at a specific index
		
		for(int i=0; i<str.length();i++) {
			
			//print only the characters not spaces
			if (!(str.charAt(i)==' ')) {
				System.out.print(str.charAt(i));
				// toCharArray will convert a String to an array of chars
				
				char[] charArray=str.toCharArray();
				System.out.print(charArray[5]);
			}
		}
	}

}
