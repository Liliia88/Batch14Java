package class12StringMethods.StringMethodsInObjects;

public class StringDemo3StartsEndsContainsTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" Olena";
		System.out.println(str);
		
		
		System.out.println(str.trim());
		
		
		String str2="Java is very easy";
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		System.out.println(str2.toLowerCase().contains("very"));
	}

}
