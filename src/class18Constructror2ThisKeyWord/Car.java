package class18Constructror2ThisKeyWord;

public class Car {
    //Common class has many dif names like parent class super class base class
    String model;
    String make;
    int year;
    String color;
    double engineCC;
    int topSpeed;
    double price;
    // if a field or method has private access modifier in parent class child classes can't use it.
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}
class BMW extends Car{
    double engineCC;

}
class Tesla extends Car{

}
class Toyota extends Car{
   double engineCC;
}
class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x5M";
        bmw.engineCC=200;
        bmw.printCarDetails();
    }
}

