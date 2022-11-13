package class28MapFile;

import java.util.LinkedHashSet;
public class HW6 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet=new LinkedHashSet<>();
        hashSet.add("R");
        hashSet.add("E");
        hashSet.add("N");
        hashSet.add("A");
        hashSet.add("T");
        for(String set:hashSet){
            System.out.print(set);
        }
        System.out.println();

    }
}
