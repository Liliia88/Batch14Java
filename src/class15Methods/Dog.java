package class15Methods;

public class Dog {
        String name; //instance
        static int nooflegs=4; //static
        String color;

        //int number=0;
        //local variables are defined inside blocks of code and can only be used inside those blocks}
    void bark() {
        int i = 4; //local
        for (int j = 0; j < i; j++) {
            System.out.println("Barking..");
        }
    }

    void printInfo(){
        System.out.println("name "+name+" color "+color);

    }
    void printName(){

        System.out.println("name "+name);
    }
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.bark();
    }
    }

