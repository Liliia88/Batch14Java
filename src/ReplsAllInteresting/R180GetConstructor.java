package ReplsAllInteresting;

public class R180GetConstructor {

    private String empName="John";
    private int empAge=30;

    public String getEmpName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }
}

class testerMain4 {
        public static void main (String[]args){
            R180GetConstructor enc=new R180GetConstructor();
            System.out.println("Employee Name: "+enc.getEmpName());
            System.out.println("Employee Age: "+enc.getEmpAge());

        }
    }

