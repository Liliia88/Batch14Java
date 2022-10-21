package class17CONSTRUCTOR;

public class Class17Employee {
    private String name;
    private String department;

    private double salary;
    private String id;
    private int age;
    private double actualSalary;

    static String companyName="Syntax";

    public Class17Employee(String empname, String empdepart, double empSalary, int empAge){
        name=empname;
        department=empdepart;
        salary=empSalary;
        age=empAge;
    }

    void printSalary(){
        actualSalary=salary+20000+10000;
        System.out.println(actualSalary);
    }
    void calculatePrintTax(){
        double tax=actualSalary*.3;
        System.out.println("Tax "+tax);
    }
    public static void main(String[] args) {
        Class17Employee josh=new Class17Employee("Josh","IT",120000, 25);
        josh.printSalary();
        josh.calculatePrintTax();

    }
}
