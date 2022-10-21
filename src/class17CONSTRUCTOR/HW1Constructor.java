package class17CONSTRUCTOR;
public class HW1Constructor {
   /*
   Write a java class that will have a constructor: one with parameters and second without any parameters.
   Create a separate Test class where you will execute both of the constructors 1 by 1.
    */
    public String name;
    String eyecolor;
    int age;
    double weight;
    String hairColor;
    int height;
    char gender;

     HW1Constructor() {
    }
     HW1Constructor(String name1, String ecolor, int age1, double weight1, String hColor,
                          int height1, char gender1) {
        name = name1;
        eyecolor = ecolor;
        age = age1;
        weight = weight1;
        hairColor = hColor;
        height = height1;
        gender = gender1;
    }
    void printInformation() {
    System.out.println("Hi, my name is " + name + ", I'm " + age + " years old,my weight is " + weight +
            " pounds and height is " + height + " inch");
    }
}