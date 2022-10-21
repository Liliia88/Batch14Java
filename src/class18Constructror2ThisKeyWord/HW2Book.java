package class18Constructror2ThisKeyWord;

public class HW2Book {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String name;
    int price;
    public HW2Book(String name) {
        this.name = name;
        System.out.println("I'm currently reading "+name+".");
    }
    public HW2Book(int price) {
        this.price = price;
        System.out.println("I bought this book for "+price+"$.");
    }

    public static void main(String[] args) {
        new HW2Book("Java Programing Course");
        new HW2Book (100);
    }
}
