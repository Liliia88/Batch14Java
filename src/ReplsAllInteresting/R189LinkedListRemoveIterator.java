package ReplsAllInteresting;

import java.util.Iterator;
import java.util.LinkedList;

public class R189LinkedListRemoveIterator {

        public static void main(String[] args) {
            LinkedList<Integer> numbers=new LinkedList<>();

            for(int i=50;i<=100;i++){
                numbers.add(i);
            }

            Iterator<Integer> iterator =numbers.iterator();
            numbers.removeIf(x -> x%3!=0);
            System.out.println(numbers+" ");
            //----------------------------------
            /*
             while (iterator.hasNext()){
            if(iterator.next()%3!=0){
              iterator.remove();
            }
             */
            /*
            ------------------------------
             for(int i=0;i<=500;i+=2){
            if(i%3!=0){
                numbers.add(i);
           }
        }
           System.out.println(numbers+" ");
             */
        }
    }

