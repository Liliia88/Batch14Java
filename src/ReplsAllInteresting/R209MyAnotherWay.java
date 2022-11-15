package ReplsAllInteresting;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class R209MyAnotherWay {
    public static void main(String[] args) {
        // creating a List that will contain map
        List<Map<String, Object>> dataList=new ArrayList<>();
        //creating first map called apple and adding items into it
        Map<String, Object>appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple" );
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);
        //adding apple Map to dataList
        dataList.add(appleMap);

        //creating second map called orange and adding items into it
        Map<String, Object>OrangeMap=new LinkedHashMap<>();
        OrangeMap.put("Items","Orange" );
        OrangeMap.put("Price",21.99);
        OrangeMap.put("Quantity",10.0);
        //adding orange Map to dataList
        dataList.add(OrangeMap);

        //initializing sum variables to be used inside the loop
        double subtotal=0;

        double TotalPurchase=0;
            //creating loop for dataList and casting each KEY
            for (var data:dataList){
                Object price = (Object)data.get("Price");
                double eachPrice = (double) price;

                Object quantity = data.get("Quantity");
                double eachQuantity = (double) quantity;

                Object items = data.get("Items");
                String item = (String) items;
                //calculating subtotal
                subtotal = eachPrice * eachQuantity;
                TotalPurchase += subtotal;
            for (var eachMap:data.entrySet()) {
                System.out.print(eachMap.getKey()+":"+eachMap.getValue()+" ");

            }
                System.out.print("SubTotal: " + subtotal);
                System.out.println();
                System.out.println();
            }
            System.out.println("Your Purchase total : "+TotalPurchase);

        }
}
