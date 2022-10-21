package ReplsAllInteresting;

public class R147ConstrLogicOperat {

        String model;
        double price;
        int quantity;

    R147ConstrLogicOperat(String model,double price,int quantity){
            this.model=model;
            this.price=price;
            this.quantity=quantity;
        }
    R147ConstrLogicOperat(String model,int quantity){
            this(model,130596.0,quantity);

        }
        void carStockValue(){
            double stockValue=price*quantity;
            System.out.println(model+" Stock Value "+stockValue);
        }
    }
class Main7 {
    public static void main (String[]args){
        new R147ConstrLogicOperat("Toyota 2019",250000.0,10).carStockValue();
        new R147ConstrLogicOperat("BMW 2019",5).carStockValue();

    }
}

