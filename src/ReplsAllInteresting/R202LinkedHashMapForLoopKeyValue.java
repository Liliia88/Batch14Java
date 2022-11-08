package ReplsAllInteresting;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
public class R202LinkedHashMapForLoopKeyValue {
    public static void main(String[] args) {
        LinkedHashMap<String,String> words=new LinkedHashMap<>();
        words.put("1 item","apple");
        words.put("2 item","banana");
        words.put("3 item","pear");
        words.put("4 item","tomato");
        words.put("5 item", "mango");
        words.put("6 item", "kiwi");

        Set<Entry<String, String>> entry = words.entrySet(); //entrySet - when we need both key and value
        for(Entry<String, String> e:entry) {
            System.out.println("Key = " + e.getKey() + " and value = " + e.getValue());
        }
     /*
        Set<Entry<String,String>> w=words.entrySet();
         Iterator<Entry<String,String>> entries = w.iterator();
         ------------------------------------
       Iterator<LinkedHashMap.Entry<String,String>> entries = words.entrySet().iterator();
        while (entries.hasNext()) {
            LinkedHashMap.Entry<String,String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
        }
*/
    }
}

