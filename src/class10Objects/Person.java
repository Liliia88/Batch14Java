package class10Objects;

public class Person {
 
	String name;
	int age;
	double weight;
	boolean isFunny;
	double height;
	boolean losingHairs;
	
	void study() {
		if(name.equals("Anna")) {
			System.out.println("I study hard");
		} else if (name.equals("Roman")) {
			System.out.println("I will keep on deleting the messages and will not let any one study");
		} else {
			System.out.println("I try to study but things don't make much sense");
		}
	}
	
	
	
	public static void main (String[] args) {
		Person person1=new Person();
		person1.name="Anna";
		person1.study();
		System.out.println("**********8");
		
		Person person2=new Person();
		person2.name="Roman";
		person2.study();
	}
}
