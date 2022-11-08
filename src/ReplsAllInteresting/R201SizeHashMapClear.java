package ReplsAllInteresting;

import java.util.HashMap;

public class R201SizeHashMapClear {
    public static void main(String[] args) {
        HashMap<String,String> words=new HashMap<>();
        words.put("Street","Patrick ST");
        words.put("Suite","265");
        words.put("City","Vienna");
        words.put("Zip","22180");
        words.put("Country", "United State");
        System.out.println(words.size());
        words.clear();
        System.out.println(words.size());
    }
}

