package ReplsAllInteresting;

import java.util.HashMap;
public class R207ReplaceIteratorVarHashM {
        public static void main(String[]args){
            HashMap<String,String> map=new HashMap<>();
            map.put("ONE","AAA");

            map.put("TWO","BBB");

            map.put("THREE","CCC");

            map.put("FOUR","DDD");

            map.put("FIVE","EEE");
            System.out.println("HashMap Before Replace :");

            var  words=map.entrySet().iterator();
            while(words.hasNext()){
                var w =words.next();
                System.out.println(w.getKey()+" : "+w.getValue());
            }
            System.out.println("------------------");
            map.replace("THREE", "ASEL");
            //map.put("ASEL","CCC");
            map.replace("FIVE","SUMAIR");

            System.out.println("HashMap After Replace :");
            var  words2=map.entrySet().iterator();
            while(words2.hasNext()){
                var w2 =words2.next();
                System.out.println(w2.getKey()+" : "+w2.getValue());
            }

        }
    }

