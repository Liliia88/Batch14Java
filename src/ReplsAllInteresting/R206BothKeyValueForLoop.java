package ReplsAllInteresting;

import java.util.HashMap;

public class R206BothKeyValueForLoop {
    public static void main(String[] args) {
        HashMap<String,String> words=new HashMap<>();
        words.put("ONE","AAA");
        words.put("TWO","BBB");
        words.put("THREE","CCC");
        words.put("FOUR","DDD");
        words.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove :");

        for ( HashMap.Entry<String, String> entry :  words.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);
        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        words.keySet().removeIf(x->x.equals("ONE"));
        words.keySet().removeIf(x->x.equals("FOUR"));

        for ( HashMap.Entry<String, String> entry :  words.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);
        }
    }}
