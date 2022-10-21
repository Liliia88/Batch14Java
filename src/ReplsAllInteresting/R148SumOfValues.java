package ReplsAllInteresting;

class R148 {
        String item;
        double price;
        int quantity;
    R148(String item,int quantity, double price){
            this.item=item;
            this.quantity=quantity;
            this.price=price;
        }
    R148(String item,double price){
            this(item, 2, price);
        }
        double itemTotalPrice(){
            double totalvalue=quantity*price;
            System.out.println(item+" Total Value "+totalvalue);
            return totalvalue;
        }
    }
class Main8 {
    public static void main (String[]args){
        R148 s1=new R148("Blanket",2, 49.99);
        double totalprice1=s1.itemTotalPrice();
        R148 s2=new R148("Mattress",  219.59);
        double totalprice2=s2.itemTotalPrice();
        System.out.println("You purchased "+(totalprice1+totalprice2)+" Today");
    }
}
