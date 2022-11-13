package class26ArrayLinkedList;

import java.util.LinkedList;

abstract public class HW2CardLinkListForLoop {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes
    credit card type.
    Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
     String creditcardtype;
     HW2CardLinkListForLoop(String creditcardtype){
         this.creditcardtype=creditcardtype;
     }
    void worldWorking(){
        System.out.println(" this card is very popular in many countries");
     }
     abstract void specificwork();
}
class Visa extends HW2CardLinkListForLoop {
     Visa(String creditcardtype){
        super(creditcardtype);
     }
    void specificwork(){
        System.out.println(creditcardtype+"  is working only in european countries ");
    }
}
class Chase extends HW2CardLinkListForLoop {
     Chase(String creditcardtype){
         super(creditcardtype);
     }
    void specificwork(){
        System.out.println(creditcardtype+"  is working in all countries all over the world ");
    }
}
class BankOfAmerica extends HW2CardLinkListForLoop {
    BankOfAmerica(String creditcardtype){
        super(creditcardtype);
    }
    void specificwork(){
        System.out.println(creditcardtype+"  is working only in any country");
    }
}

class testTester {
    public static void main(String[] args) {
       /* HW2CardLinkListForLoop visa = new Visa("Regular Visa credit card");
        HW2CardLinkListForLoop chase = new Chase("Premium Chase credit card");
        HW2CardLinkListForLoop bankOfAmerica = new BankOfAmerica("Gold BankOfAmerica credit card");
       */
        LinkedList<HW2CardLinkListForLoop> listofcards = new LinkedList<>();
        listofcards.add(new Visa("Regular Visa credit card"));
        listofcards.add(new Chase("Premium Chase credit card"));
        listofcards.add(new BankOfAmerica("Gold BankOfAmerica credit card"));
        for (HW2CardLinkListForLoop list : listofcards) {
            list.worldWorking();
            list.specificwork();
        }
    }
}