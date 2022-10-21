package class19InheritanceSuper;

public class HW2_A {
    /*
    Write program to inherit class
    A that has method printF which is static and call or reuse that method into class B
     */
    static void printF(){
        System.out.println("I love Java Programming!");
    }
}
 class B extends HW2_A{

 }

 class tester3{
     public static void main(String[] args) {
         B.printF();
         HW2_A.printF();
     }
 }