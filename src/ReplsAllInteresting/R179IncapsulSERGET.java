package ReplsAllInteresting;

public class R179IncapsulSERGET {

    String empName;
    int empAge;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setempAge(int empAge){
        this.empAge=empAge;
    }
}
    class testerMain{
        public static void main(String[] args) {
            R179IncapsulSERGET encap=new R179IncapsulSERGET();
            encap.setEmpName("Mario");
            encap.setempAge(32);
            System.out.println("Employee Name: "+encap.getEmpName());
            System.out.println("Employee Age: "+encap.getEmpAge());
        }
    }