package ReplsAllInteresting;

import java.util.LinkedList;
public class R189LinkedListRemoveIteratorDifWays {
        public static void main(String[] args) {
            LinkedList<Integer> numbers=new LinkedList<>();
            for(int i=50;i<=100;i++){
                   numbers.add(i);

            }
          //  System.out.println(numbers);
/*
           numbers.removeIf(x -> x%3!=0);           //- LAMBDA
           System.out.println(numbers+" ");
           */

            //----------------------------------
/*
            Iterator<Integer> iterator =numbers.iterator(); //-ITERATOR
             while (iterator.hasNext()){
            if(iterator.next()%3!=0){
              iterator.remove();
            }}System.out.println(numbers);
*/
           // ------------------------------

            for(int i=0;i<numbers.size();i++){
              if(i%3!=0) {
                  numbers.remove(i);
              }}
                  System.out.print(numbers);

         /*    for(Integer n:numbers){
                 if(n%3!=0){
                     System.out.println(numbers.remove());
           }}
*/
    }}

