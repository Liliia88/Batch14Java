package ReplsAllInteresting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class R203ValueKeyBothIteratorHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> words=new HashMap<>();
        words.put("mango",10);
        words.put("apple",30);
        words.put("orange",20);
        words.put("mango",40);
        words.put("mango", 40);

          //Set<Entry<String,Integer>> w=words.entrySet();
         Iterator<Entry<String,Integer>> entries = words.entrySet().iterator();

        while (entries.hasNext()) {
            HashMap.Entry<String,Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
        }
        }
    }



