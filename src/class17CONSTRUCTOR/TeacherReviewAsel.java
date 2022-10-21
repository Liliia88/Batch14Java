package class17CONSTRUCTOR;

public class TeacherReviewAsel {
    String name;
    String lastName; // instance v.
    int experience;
    String subject;
    double salary;
    //to initialize the object the main purpose of Constructor;

    static String school;
    //how to create a C.
    //1/ C name=classname
    //2/ no return type not even void
    //c - is a parameter c.
    //using below C. WE INITIALIZE Instance variables

    TeacherReviewAsel (String fname, String lName){  //local v.
        name=fname; //assignment operation from right to the left
        lastName=lName;
    }
    void print (){
        System.out.println(name+" "+lastName);
    }
}
