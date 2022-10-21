package class17CONSTRUCTOR;

import java.util.Scanner;

public class PersonConstructor {

    String name;
    String color;
    String country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    static char gender='M';


    public PersonConstructor(){

    }

    public PersonConstructor(String perName){
        name=perName;
    }
    public PersonConstructor(String name, String color, String country, int age, double weight, String hairColor,
                  String eyeColor, double height, char gender) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.gender = gender;
    }

    public static void main(String[] args) {
        PersonConstructor person=new PersonConstructor();
        PersonConstructor person2=new PersonConstructor("Asma");
        Scanner scanner=new Scanner(System.in);
    }
}
