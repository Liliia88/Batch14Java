package class17CONSTRUCTOR;

public class HW3AsgharWay4Constrauctors {
    private HW3AsgharWay4Constrauctors()
    {
        System.out.println("private");
    }
   HW3AsgharWay4Constrauctors(String name){
       System.out.println(name);
   }
    protected HW3AsgharWay4Constrauctors(int age){

        System.out.println(age);
    }
    public HW3AsgharWay4Constrauctors(boolean itTrue){

        System.out.println("public");
    }


    public static void main(String[] args) {
        new HW3AsgharWay4Constrauctors();
        new HW3AsgharWay4Constrauctors("Thank you");
        new HW3AsgharWay4Constrauctors(10);
        new HW3AsgharWay4Constrauctors(true);
    }
}
