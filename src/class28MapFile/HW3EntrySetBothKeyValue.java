package class28MapFile;

import java.util.HashMap;

public class HW3EntrySetBothKeyValue {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Long,String> items=new HashMap<>();
        items.put(3487584L,"IPhone14");
        items.put(2309455L,"IWatch");
        items.put(1234567L,"TV");
        items.put(9876543L,"Screen");
        items.put(0102030L,"Ipad");
        for(var i:items.entrySet()){
            System.out.println(i.getKey()+" = "+i.getValue());
        }
        var i = items.entrySet();
        System.out.println(i);
    }
}
