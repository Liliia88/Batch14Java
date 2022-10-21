package class19InheritanceSuper;

public class HW5_Shape_class {
    int radius;
    public HW5_Shape_class(int radius) {
        this.radius = radius;
    }
    /*
        Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
         In circle class create a method to calculate the area of circle. Test your code
         */
}
class Circle extends HW5_Shape_class{
    double p=3.14;
    public Circle(int radius) {
        super(radius);
        this.p=p;
    }
    void calculate(){
        System.out.println("The area of circle is = " + p*radius*radius);
    }
}
class test3{
    public static void main(String[] args) {
        new Circle(5).calculate();
    }
}