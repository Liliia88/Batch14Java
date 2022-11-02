package ReplsAllInteresting;

import java.util.ArrayList;
import java.util.Iterator;

public class R185Iteratorprintallnum {

        public static void main (String[]args){
            ArrayList<Integer> numbers= new ArrayList<>();
            numbers.add(111);
            numbers.add(111);
            numbers.add(111);
            numbers.add(999);
            numbers.add(999);
            numbers.add(999);
            Iterator<Integer> iterator =numbers.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

