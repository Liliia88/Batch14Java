package class18Constructror2ThisKeyWord;

public class HW2BookAsgharWay {
    /*
 Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    public static void main(String[] args) {
        HW2BookAsgharWay headFirstJava = new HW2BookAsgharWay("HeadIFirstJava", "Kathy", 12, 13345);
        HW2BookAsgharWay dataStructures = new HW2BookAsgharWay("HeadIFirstJava", "Kathy", 12);
    }


    String name;
    String author;
    int noOfTotalCh;
    int ISBN;

    public HW2BookAsgharWay(String name, String author, int noOfTotalCh, int ISBN) {
       /* this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;*/
        this(name, author, noOfTotalCh);
        this.ISBN = ISBN;
    }

    public HW2BookAsgharWay(String name, String author, int noOfTotalCh) {
        this.name = name;
        this.author = author;
        this.noOfTotalCh = noOfTotalCh;
    }

}