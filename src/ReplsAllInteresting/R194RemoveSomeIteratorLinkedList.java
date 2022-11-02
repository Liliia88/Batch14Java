package ReplsAllInteresting;

import java.util.Iterator;
import java.util.LinkedList;

public class R194RemoveSomeIteratorLinkedList {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Iterator<String> iterator=countries.iterator();
        while (iterator.hasNext()){
            //  String item= iterator.next(); //better approach
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(countries);
    }
}

