package class19InheritanceSuper;

public class AnimalHierarchicalI {
    String name;
    String breed;
    String color;
    public AnimalHierarchicalI(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    public void printInfo(){
        System.out.println("Name "+name+" Breed"+breed+" Color "+color);
    }
}
