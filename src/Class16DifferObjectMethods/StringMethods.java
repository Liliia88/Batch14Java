package Class16DifferObjectMethods;

public class StringMethods {

    public static void main (String[]args){
        syntaxEmployee asgharEmp=new syntaxEmployee();
        asgharEmp.empId="123";
        asgharEmp.salary=100000;

        syntaxEmployee.CEO="Asel";
        System.out.println(asgharEmp.CEO);
        syntaxEmployee asgharEmp2=new syntaxEmployee();

    }
}
