package class18Constructror2ThisKeyWord;

public class CatTHIS extends Animal{
    String color;
    double height;

    public CatTHIS(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public CatTHIS(String name, String breed, String color, int age, double weight, double height) {
        /*this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
        this(name, breed, color,age,weight);
        this.height = height;
    }


}
