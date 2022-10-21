package ReplsAllInteresting;

public class R143This4cONSTRUCTORS {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    R143This4cONSTRUCTORS(String make,String model, int numberOfDoors, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    R143This4cONSTRUCTORS(String make,String model, int topSpeed, double price){
        this(make,model,4, topSpeed, price);
    }
    R143This4cONSTRUCTORS(int numberOfDoors, int topSpeed, double price){
        this("unknown", "unknown", numberOfDoors,topSpeed,price);
    }
    R143This4cONSTRUCTORS(String make,String model, int numberOfDoors){
        this(make,model,numberOfDoors,90,0.0);
    }

    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

}
class Main4 {

    public static void main (String[]args){
        R143This4cONSTRUCTORS c1=new R143This4cONSTRUCTORS("Toyota", "Prius",4,120,30000.0);
        c1.display();
        R143This4cONSTRUCTORS c2=new R143This4cONSTRUCTORS("Toyota", "Prius",120,30000.0);
        c2.display();
        R143This4cONSTRUCTORS c3=new R143This4cONSTRUCTORS(4,120,30000.0);
        c3.display();
        R143This4cONSTRUCTORS c4=new R143This4cONSTRUCTORS("Toyota", "Prius",4);
        c4.display();


    }
}
