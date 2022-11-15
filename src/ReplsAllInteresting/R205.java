package ReplsAllInteresting;

import java.util.HashMap;

public class R205 {
    public static void main(String[] args) {
        HashMap<String,String> words=new HashMap<>();
        words.put("Street","Patrick ST");
        words.put("Suite","265");
        words.put("City","Vienna");
        words.put("Zip","22180");
        words.put("Country", "United State");
        //Collection<String> values=words.values();
        var iterator = words.entrySet().iterator();
        //Iterator<String> iterator= values.iterator();
        while (iterator.hasNext()){
            var entry = iterator.next();
            //HashMap.Entry<String,String> entry = iterator.next();
            //String item=iterator.next();
            System.out.println(entry.getValue().toUpperCase());

        }
    }
    }

