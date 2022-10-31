package ReplsAllInteresting;

public class R181SetGet {
        private long acc_no;
        private String name;
        private String email;
        private double amount;

        public R181SetGet(long acc_no,String name,String email, double amount){
            setacc_no(acc_no);
            setname(name);
            setemail(email);
            setamount(amount);
        }
        public long getacc_no() {
            System.out.print(acc_no+" ");
            return acc_no;
        }
        public void setacc_no(long acc_no){
            this.acc_no=acc_no;
        }
        public String getname() {
            System.out.print(name+" ");
            return name;
        }
        public void setname(String name){
            this.name=name;
        }
        public String getemail() {
            System.out.print(email+" ");
            return email;
        }
        public void setemail(String email){
            this.email=email;
        }
        public double getamount() {
            System.out.print(amount+" ");
            return amount;
        }
        public void setamount(double amount){
            this.amount=amount;
        }
    }
class testerMain2 {
    public static void main (String[]args){
        R181SetGet a=new R181SetGet(7560504000L,"Sumair","sumair@syntax.com",50000.0);
        a.getacc_no();
        a.getname();
        a.getemail();
        a.getamount();
    }
}
