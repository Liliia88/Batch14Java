package class21Overridding;

public class HW2_CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    double balance;
    double interestRate;

    void calculate(double balance,double interest) {
        System.out.println(balance*interest/100);
    }
}
class Visa2 extends HW2_CreditCard{

}
class AX extends HW2_CreditCard{
    void calculate(double balance,double interestRate) {
        System.out.println((interestRate/12)*balance);
    }
}
class test21{
    public static void main(String[] args) {
        new HW2_CreditCard().calculate(500.00,7);
        new Visa2().calculate(700.34,6.5);
        new AX().calculate(1025.02,4.5);

    }
}