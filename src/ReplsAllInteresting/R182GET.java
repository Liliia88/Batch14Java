package ReplsAllInteresting;
public class R182GET {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public R182GET(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }
    public String getfirstname() {
        return firstname;
    }
    public String getlastname() {
        return lastname;
    }
    public String formatBirthday(){
        return(birthmonth+"/"+birthday+"/"+birthyear);
    }
    public String getssn() {
        return ssn;
    }

}
class testerMain3 {
    public static void main (String[]args){
        R182GET p=new R182GET("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(p.getfirstname());
        System.out.println(p.getlastname());
        System.out.println(p.formatBirthday());
        System.out.println(p.getssn());
    }
}
