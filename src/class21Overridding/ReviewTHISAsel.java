package class21Overridding;

public class ReviewTHISAsel {
    String name, lname;
    String subject;
    int experience;
    double salary;
    static String school;
//THIS. -use to refer to the current object: instance variables
                                          // instance methods
    ReviewTHISAsel(String name, String lname) {
        this.name = name;
        this.lname = lname;
//this()-refers to the current object:current class constructor
    }
    ReviewTHISAsel(String name, String lname, String subject){
        this(name, lname);
        this.subject=subject;
    }
    ReviewTHISAsel(String name, String lname, int experience){
        this(name, lname);
        this.experience=experience;
    }
    static void work(){
        System.out.println("All teachers work at "+school);
    }
    void print(){
        work();
        System.out.println("Teacher name is "+name+lname);
    }
    void teach(){
        this.print();
        System.out.println(name+"teaches "+subject);
    }
}
class tester21{
    public static void main(String[] args) {
        ReviewTHISAsel r=new ReviewTHISAsel("John", "Smith");
        System.out.println(r.name);
        ReviewTHISAsel r2 =new ReviewTHISAsel("Jane","Smith","Biology");
        ReviewTHISAsel r3=new ReviewTHISAsel("Jack","Smith");
        ReviewTHISAsel.school="syntax";
        ReviewTHISAsel.work();
    }
}