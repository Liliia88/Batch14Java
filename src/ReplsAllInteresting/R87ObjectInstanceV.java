package ReplsAllInteresting;

public class R87ObjectInstanceV {

    String Color;
    int Year;
    String Make;

    void carcharacteristics(){
        System.out.println("Car color is "+Color+" and car year is "+Year+" and car model is "+Make);
    }
    public static void main(String[]args){
        R87ObjectInstanceV car=new R87ObjectInstanceV();
        car.Color="Black";
        car.Year=2019;
        car.Make="BMW";
        car.carcharacteristics();

        R87ObjectInstanceV car2=new R87ObjectInstanceV();
        car2.Color="White";
        car2.Year=2018;
        car2.Make="Toyota";
        car2.carcharacteristics();
    }
}
