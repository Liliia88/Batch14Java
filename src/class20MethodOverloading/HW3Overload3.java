package class20MethodOverloading;

public class HW3Overload3 {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/
    static void print(int number){
        System.out.println(number);
    }
    static void print(int number, String word){
        System.out.println("Sweet sweet home");
    }
    static void print(int number, int number2){
        System.out.println(number*number2);
    }

    public static void main(String[] args) {
        HW3Overload3.print(2);
        HW3Overload3.print(2,"home");
        HW3Overload3.print(2,3);

    }
}
