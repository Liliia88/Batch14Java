package class14CreateObjMethodes;

public class Math2WordInSout {
    //A Method that does not take any parameters and prints some lines o nthe console
    void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }
    //A merthod that takes a single parameter of type String  and prints it
    void printWord(String word){

        System.out.println(word);
}
    public static void main(String[] args) {
        Math2WordInSout obj=new Math2WordInSout();
        obj.printHello();
        obj.printWord("Taivion Dont't worry it's Java");
    }
    }

