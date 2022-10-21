package class21Overridding;

public class HW1Degree {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school
    diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
     In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.*/
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
    class Bachelors extends HW1Degree {

    }
    class Masters extends HW1Degree {

        void getPrerequisite() {
            System.out.println("To get a degree you don't need high school diploma");
        }
    }
class tester20{
    public static void main(String[] args) {
        new HW1Degree().getPrerequisite();
        new Bachelors().getPrerequisite();
        new Masters().getPrerequisite();
    }
}
