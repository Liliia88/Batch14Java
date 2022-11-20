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

            dataList.add(appleMap);

            Map<String, Object> orangeMap=new LinkedHashMap<>();
            orangeMap.put("Items", "Orange");
            orangeMap.put("Price", 21.99);
            orangeMap.put("Quantity", 10.0);
            dataList.add(orangeMap);

            double price=0;
            double quantity=0;
            double total=0;
            for(var data:dataList) {
                for (var key : data.entrySet()) {
                    if (key.getKey().equalsIgnoreCase("Price")) {
                        // price=Double.parseDouble(key.getValue().toString())
                        price = (double) key.getValue();
                    } else if (key.getKey().equalsIgnoreCase("Quantity")){
                        quantity = (double) key.getValue();
                }
                System.out.print(key.getKey() + ":" + key.getValue()+" ");

            }
               total+=price*quantity;
                System.out.println("Subtotal "+(price*quantity));

            }
            System.out.println("Your Purchase total : "+total);

        }
    }

