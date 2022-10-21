package ReplsAllInteresting;

public class R166Overriding1MethodOtherM {
    String name;
    R166Overriding1MethodOtherM(String name){
        this.name=name;
    }
    void eat(){
        System.out.println("Cat eats");
    }
    void sleep(){
        System.out.println("Animals like to sleep");
    }
}
class Cat extends R166Overriding1MethodOtherM{
    Cat(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name+" sleeps a lot");
    }
}
class Kitten1 extends Cat{
    Kitten1(String name){
        super(name);
    }
    void eat(){
        System.out.println(name+ " eats milk");
    }
}
class Kitten2 extends Cat{
    Kitten2(String name){
        super(name);
    }
    void eat(){
        System.out.println(name+ " eats snacks");
    }
}
class Kitten3 extends Cat{
    Kitten3(String name){
        super(name);
    }
    void eat(){
        System.out.println(name+ " eats everything");
    }
}

class Main {
    public static void main (String[]args){
        Cat cat=new Cat("Cat");
        Kitten1 k1=new Kitten1("kitten1");
        Kitten2 k2=new Kitten2("kitten2");
        Kitten3 k3=new Kitten3("kitten3");
        R166Overriding1MethodOtherM[] animal={new Cat("Cat"),new Kitten1("kitten1"),new Kitten2("kitten2"),new Kitten3("kitten3")};
        for(R166Overriding1MethodOtherM a:animal){
            a.eat();
            a.sleep();
        }
    }
}
