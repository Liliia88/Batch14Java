package class19InheritanceSuper;

public class FurnitureDifferWAYSThisNoConstruct {
    String color="green";
}
class Chair extends FurnitureDifferWAYSThisNoConstruct {
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

class Tester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}