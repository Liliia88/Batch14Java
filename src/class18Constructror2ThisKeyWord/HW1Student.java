package class18Constructror2ThisKeyWord;

public class HW1Student {
    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    public HW1Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo(){

        System.out.println("My name is "+name+", I live by following address: "+address);
    }

    public static void main(String[] args) {
        new HW1Student("Lili","130 Kit Ln,Lithia").displayInfo();
    }

}
