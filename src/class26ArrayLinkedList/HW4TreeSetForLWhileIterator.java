package class26ArrayLinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HW4TreeSetForLWhileIterator {
    /*
    Create a Set collection in which you need to add names of the countries. In this set we want all objects to be
     sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("USA");
        hashSet.add("Russia");
        hashSet.add("France");
        hashSet.add("Australia");
        hashSet.add("Argentina");
        hashSet.add("Ireland");
        System.out.println(new TreeSet<>(hashSet));
       //--------------------------
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("USA");
        treeSet.add("Russia");
        treeSet.add("France");
        treeSet.add("Australia");
        treeSet.add("Argentina");
        treeSet.add("Ireland");
        System.out.println(treeSet);
        //-----------------------------------
        for(String ts:treeSet){
            System.out.print(ts+" ");
        }
        System.out.println();

        Iterator<String> iterator =treeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }
}
