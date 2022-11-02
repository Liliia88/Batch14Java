package ReplsAllInteresting;
public class R181SetGet {
    private long acc_no;
    private String name;
    private String email;
    private double amount;
    public long getacc_no() {
        return acc_no;
    }
    public void setacc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public String getname() {
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public double getamount() {
        return amount;
    }
    public void setamount(double amount){
        this.amount=amount;
    }
}
class testerMain2 {
    public static void main (String[]args){
        R181SetGet a=new R181SetGet();
        a.setacc_no(7560504000L);
        a.setname("Sumair");
        a.setemail("sumair@syntax.com");
        a.setamount(50000.0);
        System.out.print(a.getacc_no()+" ");
        System.out.print(a.getname()+" ");
        System.out.print(a.getemail()+" ");
        System.out.print(a.getamount());
    }
}
