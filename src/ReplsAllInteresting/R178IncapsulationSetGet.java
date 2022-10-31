package ReplsAllInteresting;

public class R178IncapsulationSetGet {
    private String empName;
    private int empAge;

    public R178IncapsulationSetGet(String empName,int empAge){
        setEmpName(empName);
        setempAge(empAge);
    }

    public String getEmpName() {
        System.out.println("Your name is "+empName);
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public int getEmpAge() {
        System.out.println("Your age is "+empAge);
        return empAge;
    }
    public void setempAge(int empAge){
        this.empAge=empAge;
    }
    //void printInfo(){
    //    System.out.println("Employee Name: "+empName);
    //    System.out.println("Employee Age: "+empAge);
    //}
}
class tester36{
    public static void main(String[] args) {
        R178IncapsulationSetGet enc=new R178IncapsulationSetGet("John",32);
       // enc.printInfo();
        enc.getEmpAge();
        enc.getEmpName();
    }
}
