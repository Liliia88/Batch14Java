package class23Abstract;
interface Drivable{
        //by default all variables public static final
        boolean DRIVES=true;

        //we cannot have a constructor, instance variables

        //by default all methods are public abstract
        void breaks();
        }
interface Vehicle{
    void haveMotor();
    //from Java 8 we can have static methods and default methods - they are implemented;
    default void haveBreak(){
        System.out.println("All vehicle have break");
    }
    static void honk(){   //you cannot override this method,  as it's static
        System.out.println("all vehicles honk");
    }
}


public abstract class ReviewInterfaceDefaultAbstractCar {
    // with help of abstract class we can achieve 0 to 100% abstraction
        String color, make, model;
        public static final int WHEELS=4;
        public ReviewInterfaceDefaultAbstractCar (String make, String model, String color) {
            this.make = make;
            this.model = model;
            this.color = color;
        }
        void drive() {
            System.out.println("All cars can drive");
        }
        abstract void start();
        abstract void stop();
    }
//if we don't want implement some methods, we can make abstract class! Tesla
    class Tesla extends ReviewInterfaceDefaultAbstractCar implements Drivable, Vehicle  {
        Tesla(String make, String model, String color) {
            super(make, model, color);
        }
        public void start() {
            System.out.println(make +" starts automatically");
        }
        public void stop () {
            System.out.println(make+" stops when we press break");
        }
        public void charge() { //Tesla's own method
            System.out.println("You need to charge "+make);
        }
        public void breaks() {  //Drivable's method
            System.out.println(make+" can break");
        }
        public void haveMotor() { //Vehicle's method
            System.out.println(make +" have motor");
        }
        public void haveBreak() { //Vehicle's method
        }
    }

class testerTest7 {
    public static void main(String[] args) {
        ReviewInterfaceDefaultAbstractCar car=new Tesla("Tesla", "X", "Yellow");
        car.drive();
        car.start();
        car.stop();
        //car.charge(); cannot use

        Tesla tesla=new Tesla("Tesla", "X", "Green");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();

        // new Car(); not possible because Car is abstract class
    }
}


