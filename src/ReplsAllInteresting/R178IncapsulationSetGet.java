package ReplsAllInteresting;

public class R178IncapsulationSetGet {

    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }

}
class tester36{
    public static void main(String[] args) {
        R178IncapsulationSetGet enc=new R178IncapsulationSetGet();
        enc.setEmpName("John");
        enc.setEmpAge(30);
        System.out.println("Employee Name: "+enc.getEmpName());
        System.out.println("Employee Age: "+enc.getEmpAge());

    }
}
