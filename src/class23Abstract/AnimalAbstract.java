package class23Abstract;

public abstract class AnimalAbstract {
    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Cat walk");
    }

    public static void main(String[] args) {
        //Animal animal=new Animal() ;
        //  aniaml.eat(); it's mistake
        // Break till 11:50

    }
}
class Cat extends AnimalAbstract{
    @Override
    void eat() {
        System.out.println("Cats like fish");
    }
    void sleep(){
        System.out.println("Cats like to sleep 12 to 16 hours");
    }
    void showAttitude(){ //cat own method separate
        System.out.println("hmm hmm hmm hmm");
    }
}

class Dog extends AnimalAbstract{
    @Override
    void eat() {
        System.out.println("Cats like watermelon");
    }
    void sleep(){
        System.out.println("Cats like to sleep 8 to 10 hours");
    }
}

