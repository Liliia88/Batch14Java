package class12StringMethods.StringMethodsInObjects;

public class StringDemoLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // proper way of creating an object
		String str =new String("Java");
		 // simpler and shorter way provided by Java Creators to make our life easier
		String name="Java"; // only works for string and wrapper classes
		/* counts the number of characters in a string including the spaces
		 * 
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		if (name.length()<15) {
			System.out.println("Name can't be more than 15 characters");
		}
	}

}
