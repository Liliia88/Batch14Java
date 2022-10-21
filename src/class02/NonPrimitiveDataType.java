package class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    // Just 1 example of non primitive data type;
		
		String name="Asma";
		String address="123 address street";
		int age=17;
		//String age="17"ANYTHING you put inside "" - inside string
		
		String phone="123-345-234";

		String character = "A";
		
		//ctr+space -> auto completes the statement
		//syso +ctrl +space+enter
		
		System.out.println(name);
		
		//"My name is" + Asma
		
		System.out.println("My name is "+ name);
		
		//Asma is 17
		System.out.println(name + " is " + age);
		
		String fruit = "apple";
		double price=1.99;
		
		//The price of the apple is 1.99
		 
		
		
		/* to attach any value (int, double, boolean, char, String ect)
		 * to a String we +
		 * + next to the String acts as Concatenation
		 * 
		 * 
		 */
		
		fruit = "mango";
		price=5.99;
		
		System.out.println("The price of the " + fruit + " is " + price);  
		
	}

}
