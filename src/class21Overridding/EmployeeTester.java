package class21Overridding;

class Employee {
    String name;
    double baseSalary=40000;
    double bonus=20000;

    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }

}
class Developer extends Employee{

    void calculateSalary(){
        System.out.println(2*baseSalary+(1.5*bonus));
    }

}

class Tester extends Employee{

    void calculateSalary(){
        System.out.println(baseSalary+(2*bonus));
    }
}

class OfficeBoy extends Employee{

}
public class EmployeeTester {
    public static void main(String[] args) {

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculateSalary();

        Tester tester=new Tester();
        tester.calculateSalary();

        Developer developer=new Developer();
        developer.calculateSalary();
    }
}
