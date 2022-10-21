package class17CONSTRUCTOR;

public class HW4 {
    /*
    Write program that have static constructor and observe result.
     */
     String car;
     int year;
     String color;

    static String HW4(String car, int year, String color) {
        car = car;
        year = year;
        color = color;
        return (car+" "+year+" "+color);
    }


    public static void main(String[] args) {

        System.out.println(HW4("Mazda", 2022, "white"));
    }



}
