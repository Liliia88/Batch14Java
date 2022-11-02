package ReplsAllInteresting;

import java.util.ArrayList;
import java.util.Iterator;

public class R187RemoveSomePrintOneByOneSevWays {
    public static void main(String[]args){
            ArrayList<String> words=new ArrayList<>();
            words.add("hi");
            words.add("yo");
            words.add("sup");
            words.add("yolo");
            words.add("boop");
            words.remove (0);
            words.remove(1);
            words.remove(2);

            //for (int i=0;i<words.size();i++){
            //  System.out.print(words.get(i)+" ");
            //   }
            // }

            //System.out.println(words.get(0)+" "+words.get(1));
            Iterator<String> iterator =words.iterator();
            while (iterator.hasNext()){
                    System.out.println(iterator.next());
            }
        }}
