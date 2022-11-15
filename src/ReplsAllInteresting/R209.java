package ReplsAllInteresting;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
public class R209 {
        public static void main(String[] args) {
            LinkedList<Map<String,Object>> dataList=new LinkedList<>();

            Map<String,Object>  appleMap=new LinkedHashMap<>();
            appleMap.put("Items", "Apple");
            appleMap.put("Price", 20.00);
            appleMap.put("Quantity", 10.0);
            double subTotal= (double)appleMap.get("Price")* (double)appleMap.get("Quantity");
            appleMap.put("SubTotal",subTotal);

            dataList.add(appleMap);

            Map<String, Object> orangeMap=new LinkedHashMap<>();
            orangeMap.put("Items", "Orange");
            orangeMap.put("Price", 21.99);
            orangeMap.put("Quantity", 10.0);
            double subTotal1=(double)orangeMap.get("Price")*(double) orangeMap.get("Quantity");
            orangeMap.put("SubTotal",subTotal1);
            dataList.add(orangeMap);

            for(var data:dataList){
                var eachkey=(Object)data.get("Items");
                var eachkey2=(Object)data.get("Price");
                var eachkey3=(Object)data.get("Price");
                for(var key:data.entrySet()){
                    System.out.print(key.getKey()+":"+key.getValue());
                }
                System.out.println();
            }
            var TotalPurchase=subTotal+subTotal1;
            System.out.println("Your Purchase total : "+TotalPurchase);

        }
    }

