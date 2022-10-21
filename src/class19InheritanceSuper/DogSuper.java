package class19InheritanceSuper;

public class DogSuper extends AnimalHierarchicalI {

    public DogSuper(String name, String breed, String color) {
        super(name,breed,color);
    }
}
    class Cat extends AnimalHierarchicalI {
        Cat(String name, String breed, String color) {
            super(name, breed, color);
        }
    }
        class TestAnimal{
            public static void main(String[] args) {
                DogSuper dog=new DogSuper("jacky","German","Black");
                dog.printInfo();
            }
        }
