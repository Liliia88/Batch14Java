package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class HW3RemoveDublicate {
    /*
    How can you remove all duplicates from ArrayList?
     */
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(new LinkedHashSet<>(aList));
    }
}
