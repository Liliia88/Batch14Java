package class19InheritanceSuper.Bird;

public class SuperKeyWordInheritance {
        String name;
        String color;
        int age;
        double weight;
    SuperKeyWordInheritance(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
   void printInfo(){
        System.out.println("Name "+name+" Color"+color+" Age "+age+" Weight "+weight);
    }
    }
    class Parrot extends SuperKeyWordInheritance {
        Parrot(String name, String color, int age, double weight) {
            super(name,color,age,weight);
        }
    }
    class Crow extends SuperKeyWordInheritance{
        boolean isClever;
        Crow(String name, String color, int age, double weight,boolean isClever) {
            super(name,color,age,weight);
            this.isClever=isClever;
        }
    }
    class Sparrow extends SuperKeyWordInheritance{
        Sparrow(String name, String color, int age, double weight) {
            super(name,color,age,weight);
        }
    }
    class Test{
        public static void main(String[] args) {
            Parrot p=new Parrot("ZEKI","Green", 2,1);
            p.printInfo();

            Crow crow=new Crow("crow","black", 3,1.5, true);
            crow.printInfo();

            Sparrow sparrow=new Sparrow("Sparrow", "White", 3,2);
            sparrow.printInfo();
        }
    }




