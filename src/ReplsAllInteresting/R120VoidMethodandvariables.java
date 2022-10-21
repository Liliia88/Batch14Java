package ReplsAllInteresting;

public class R120VoidMethodandvariables {
    int year;
    String schoolname;
    int batchnumber;

    void studying(){
        System.out.println("I am a student of batch "+batchnumber+" studying at "+schoolname+" in the year of "+year);
    }
    public static void main(String[]args){
        R120VoidMethodandvariables obj=new R120VoidMethodandvariables();
        obj.year=2021;
        obj.schoolname="Syntax";
        obj.batchnumber=9;
        obj.studying();
    }
}
