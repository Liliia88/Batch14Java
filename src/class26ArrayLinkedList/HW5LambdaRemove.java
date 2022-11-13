package class26ArrayLinkedList;

import java.util.LinkedHashSet;

public class HW5LambdaRemove {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("New York");
        hashSet.add("Moscow");
        hashSet.add("Tampa");
        hashSet.add("Baikonur");
        hashSet.add("Orenburg");
        hashSet.add("Amsterdam");
        hashSet.add("Los Angeles");
        System.out.println(hashSet);

        hashSet.removeIf(x -> x.startsWith("A"));
        System.out.println(hashSet);

    }
}
