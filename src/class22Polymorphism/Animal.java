package class22Polymorphism;

public class Animal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hours");
    }
}
class Panda extends Animal{

    void eat(){
        System.out.println("Pandas eat Bamboos");
    }

    /*
    @ovverirde is an annotation that tells java to check for extra rules like if we are properly overriding
    a method or not
     */
    @Override
    void sleep() {
        System.out.println("Pandas sleep for 14 hours");
    }
}
class Cat extends Animal{

    void eat(){
        System.out.println("Cats like to eat Fish");
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();
    }
    Animal animal=new Panda(); //Upcasting
    //Panda panda=new Animal(); down-casting
    Animal animal1=new Cat();
    Animal[] animals= {new Cat(), new Panda()};

}
