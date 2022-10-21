package class20MethodOverloading;
public class HW1 {
    /*
     Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box

Use separate class to test your code
      */
    void math(int a, int b) {
        System.out.println(a * b);
    }
    void math(int a) {
        System.out.println(a * a);
    }
    void math(int a, int b, int c) {
        System.out.println(2 * (a * b + a * c + b * c));
    }
}
    class main5{
    public static void main(String[] args) {
        new HW1().math(5, 9, 12);
    }
    }

