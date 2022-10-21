package class17CONSTRUCTOR;

public class TestDog {
    public static void main(String[] args) {
        DogReviewAsel dog1=new DogReviewAsel();
        // how to access instance variables?
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        DogReviewAsel dog2=new DogReviewAsel();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        dog2.printInfo();

        dog1.name="Bobik";
        dog1.breed="german";

        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        float price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to jump"); //a value that I pass - argument
        dog1.love("to play");
    }
}
