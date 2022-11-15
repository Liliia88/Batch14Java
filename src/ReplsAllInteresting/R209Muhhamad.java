package ReplsAllInteresting;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class R209Muhhamad {
    public static void main(String[] args) {
        // creating a List that will contain map
        LinkedList<Map<String,Object>> dataList=new LinkedList<>();
        //creating first map called apple and adding items into it
        Map<String,Object> apple=new LinkedHashMap<>();
        apple.put("Items","Apple");
        apple.put("Price",20.00);
        apple.put("Quantity",10.0);
        //calculating SubTotal of apples
        double subTotal= (double)apple.get("Price")* (double)apple.get("Quantity");
        //adding SubTotal of apples in Map
        apple.put("SubTotal",subTotal);
        //adding apple Map to dataList
        dataList.add(apple);
        //creating second map called orange and adding items into it
        Map<String,Object> orange=new LinkedHashMap<>();
        orange.put("Items","Orange");
        orange.put("Price",21.99);
        orange.put("Quantity",10.0);
        //calculating SubTotal of oranges
        double subTotal1=(double) orange.get("Price")*(double) orange.get("Quantity");
        //adding SubTotal of oranges in Map
        orange.put("SubTotal",subTotal1);
        //adding orange Map to dataList
        dataList.add(orange);
        //creating loop for dataList
        for (var items:dataList) {
            var Key1=items.get("Items");
            var Key2=items.get("Price");
            var Key3=items.get("Quantity");
            System.out.println(Key1);
            var item=items.entrySet();
            // creating loop tp print all the values
            for (var value:item) {
                System.out.print(value.getKey()+": "+value.getValue()+" ");
            }
            System.out.println();
            System.out.println();
        }
        //calculating sum of subTotal and printing
        var TotalPurchase=subTotal+subTotal1;
        System.out.println("Your Purchase total : "+TotalPurchase);

    }
}
