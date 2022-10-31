package ReplsAllInteresting;

public class R179IncapsulSERGET {

        String empName;
        int empAge;

        public String getEmpName() {
            System.out.println("Employee Name: "+empName);
            return empName;
        }
        public void setEmpName(String empName){
            this.empName=empName;
        }
        public int getEmpAge() {
            System.out.println("Employee Age: "+empAge);
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
            encap.getEmpName();
            encap.getEmpAge();
        }
    }