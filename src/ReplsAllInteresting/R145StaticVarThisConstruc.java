package ReplsAllInteresting;

public class R145StaticVarThisConstruc {
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    R145StaticVarThisConstruc(String dogName,double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }
    void printInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}
class Main5 {
    public static void main(String[]args){
        new R145StaticVarThisConstruc("Tarzan",50.0).printInfo();
        new R145StaticVarThisConstruc("Lucy", 10.0).printInfo();

    }
}