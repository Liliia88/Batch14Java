package ReplsAllInteresting;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class R204ValueIteratorLinkedHashMap {
        public static void main(String[] args) {
            LinkedHashMap<String,String> words=new LinkedHashMap<>();
            words.put("Street","Patrick ST");
            words.put("Suite","265");
            words.put("City","Vienna");
            words.put("Zip","22180");
            words.put("Country", "United State");
            Collection<String> values=words.values();

            Iterator<String> iterator= values.iterator();
            while (iterator.hasNext()){
                String item=iterator.next();
                System.out.println(item);
            }
        }}


