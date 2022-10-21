package class10Objects;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Deleting message from Discord");
	}
	void eat() {
		System.out.println("Eating pizzzzzzzza...");
	}
	public static void main (String[]args) {
		//new Student()=> Create the object of Student class
		Student friadoonObject=new Student();
		friadoonObject.name="Friadoon";
		friadoonObject.id="123";
		friadoonObject.age=22;
		
		System.out.println(friadoonObject.name);
		System.out.println(friadoonObject.age);
		friadoonObject.deleteMessages();
		friadoonObject.deleteMessages();
		
		Student student2=new Student();
		student2.name="Asma";
		student2.weight=30;
		student2.age=17;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
		
	}
}
