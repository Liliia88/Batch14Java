package class27;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntrySetMethodBothKeyValue {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1 item","apple");
        map.put("2 item","banana");
        map.put("3 item","pear");
        map.put("4 item","tomato");
        map.put("5 item", "mango");
        map.put("6 item", "kiwi");
        //Set<Integer> set = new HashSet<Integer>();

        Set<Entry<String, String>> entry = map.entrySet();
        for(Entry<String, String> e:entry){
            System.out.println(e.getKey()+e.getValue());
        }
    }
}
