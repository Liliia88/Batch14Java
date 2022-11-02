package class24EncapsulatArrListADDCollectFramework;

public class Horse {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;
    public Horse(String name, String breed, int age, double weight, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.length()<5){
            System.out.println("I don't like this horse");
        } else{
            this.name = name;
        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.length()<4){
            System.out.println("I like this horse");
        } else{
            this.breed = breed;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>10){
            System.out.println("This horse is not young");
        } else{
            this.age = age;
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>250){
            System.out.println("This horse is fat");
        } else{
            this.weight = weight;
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("red")){
            System.out.println("This horse is adorable");
        } else{
            this.color = color;
        }
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight+" Color "+color);
    }
}
class tester36{
    public static void main(String[] args) {
        Horse mini=new Horse("Marta","Austrian",5,200,"white");
        mini.printInfo();
        System.out.println(mini.getColor());
    }
}
