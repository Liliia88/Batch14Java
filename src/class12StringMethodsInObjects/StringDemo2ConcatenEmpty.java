package class12StringMethodsInObjects;

public class StringDemo2ConcatenEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Olena";
		String lastName="Dudka";
		System.out.println(firstName+lastName);// Mostly this is used
		System.out.println(firstName.concat("").concat(lastName));
		
		String str=" ";
		/*
		 * isEmpty() returns true if a String is empty this method will return false even if u have
		   a space in a String variable however the isBlank method does not count the spaces
		 * 	 * 
		 */
		System.out.println(str.isEmpty());
	   // System.out.println(str.isBlank()); it's true, but we have previous version of Eclipse, doesn's show here.
	   
		
		
	}

}
