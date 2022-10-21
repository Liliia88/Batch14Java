package ReplsAllInteresting;

public class R142Constructor2Obj1NULL {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    R142Constructor2Obj1NULL(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    R142Constructor2Obj1NULL(){
    }
    void printInfo(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }



    public static void main (String[]args){
        new R142Constructor2Obj1NULL().printInfo();
        new R142Constructor2Obj1NULL("Syntax",6,2020,"07/30/2020").printInfo();

    }
}

