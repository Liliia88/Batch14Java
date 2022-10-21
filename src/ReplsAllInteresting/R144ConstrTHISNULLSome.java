package ReplsAllInteresting;

public class R144ConstrTHISNULLSome {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    R144ConstrTHISNULLSome(String lable, double price, String category, boolean hasExpiration, int stock){
        this.lable=lable;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    R144ConstrTHISNULLSome(String lable, double price, int stock){
        this.lable=lable;
        this.price=price;
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    R144ConstrTHISNULLSome(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
        //this(lable,price,0);
    }
    public void display(){
        System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
        System.out.println();
    }
}
class Main2 {

    public static void main(String [] args){
        new R144ConstrTHISNULLSome("Eggs", 3.0,"Produce", true, 10).display();
        new R144ConstrTHISNULLSome("Paper Towels", 2.0,24).display();
        new R144ConstrTHISNULLSome("Paper Towels", 2.0).display();
    }
}
