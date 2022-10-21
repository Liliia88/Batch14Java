package class21Overridding;

public class HW2AsgharWayCreditCaed {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
}

class CreditCard{
    double balance;
    double interest;
    CreditCard(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }

    void calculateInterest(){

        double interestAmount=interest*balance/100;
        System.out.println("Interest Amount "+interestAmount);
    }

}
class Visa extends CreditCard{

    Visa(double balance,double interest){
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("interest Amount "+(interestAmount+5));
    }
}

class AX2 extends CreditCard{

    AX2(double balance,double interest){
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest Amount "+(interestAmount+10));
    }
}
class CreditCardTester {
    public static void main(String[] args) {
     Visa visa=new Visa (100,5);
     visa.calculateInterest();
    }
}