package class14CreateObjMethodes;

public class HW5EmailStringMethod {
    String email(String name, String lastname, String email){

        return (name+lastname+"@"+email+".com").toLowerCase();
    }

    public static void main(String[] args) {
        HW5EmailStringMethod obj=new HW5EmailStringMethod();
        String fullemail=obj.
                 email("liliya","hakimova", "gmail");
        System.out.println(fullemail);
    }
}
