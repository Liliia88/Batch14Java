package ReplsAllInteresting;

public class R150MultilevelWay {
    String name;
    String lastName;
    int age;
    R150MultilevelWay(String name,String lastName,int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
class Employee4 extends R150MultilevelWay {
    int salary;
    Employee4(String name,String lastName,int age,int salary){
        super(name,lastName,age);
        this.salary=salary;
    }
    void printEmployee(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student4 extends Employee4{
    int grade;
    Student4(String name,String lastName,int age,int salary,int grade){
        super(name,lastName,age,salary);
        this.grade=grade;
    }
    void printStudent(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree4 extends Student4{
    String seniorActivity;
    Retiree4(String name,String lastName,int age,int salary,int grade,String seniorActivity){
        super(name,lastName,age,salary,grade);
        this.seniorActivity=seniorActivity;
    }
    void printRetiree(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
class Main23{
    public static void main(String[] args){
        new Employee4("Joe","Smith",35,35000).printEmployee();
        new Student4("Adam","Smith",15,0,10).printStudent();
        new Retiree4("Frank","Smith",15,25,00000,"tour").printRetiree();
    }
}

