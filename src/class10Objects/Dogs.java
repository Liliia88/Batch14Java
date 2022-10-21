package class10Objects;

public class Dogs {

	String name;
	String color;
	double weight;
	int age;

	void bark() {
		System.out.println(name+ " is barking...");
	}
	void eat() {
		System.out.println(name+" is eating...");
	}
	void playing() {
			if(name.equals("Donut")) {
				System.out.println("This dog is very smart!");
			} else if (name.equals("Squizy")) {
				System.out.println("This dog is very fast!");
			} else {
				System.out.println("This dog is very kind!");
			}
	}
		public static void main (String[]args) {
		Dogs Husky=new Dogs();
		Husky.name="Donut";
		Husky.color="brown";
		Husky.age=5;
		Husky.bark();
		Husky.eat();
		Husky.playing();
		System.out.println(Husky.name+" likes to swim");
		
		Dogs Bulldog=new Dogs();
		Bulldog.name="Squizy";
		Bulldog.color="black";
		Bulldog.age=8;
		Bulldog.bark();
		Bulldog.eat();
		Bulldog.playing();
		System.out.println("I like to play with "+Bulldog.name+", he is "+Bulldog.age+" years old.");
		
		Dogs Labrador=new Dogs();
		Labrador.name="Gibraltar";
		Labrador.color="white";
		Labrador.age=7;
		Labrador.bark();
		Labrador.playing();
		Labrador.eat();
		System.out.println(Labrador.name+" was born "+Labrador.age+" years ago.");
			
}
}