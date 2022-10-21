package ReplsAllInteresting;

public class R146Construc1NULL {
String name;

String lastName;

        int employeeId;

        String startDate;

        int salary;

    R146Construc1NULL (){

        }
    R146Construc1NULL (String name, String lastName, int employeeId,String startDate,int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
        }
        void printInfo(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
        }
}
class Main6 {
    public static void main(String[]args){
        new R146Construc1NULL().printInfo();
        new R146Construc1NULL("Joe","Smith",12345,"01/01/1970",35000).printInfo();
    }
}
