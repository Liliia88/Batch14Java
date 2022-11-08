package ReplsAllInteresting;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class R199TwoWaysLoopIterator {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("null");
        linkedHashSet.add("Sohil");
        linkedHashSet.add("Diego");
        linkedHashSet.add("Alijon");
        linkedHashSet.add("Asel");
        linkedHashSet.add("Sumair");
        for (String list : linkedHashSet) {
            System.out.println(list);
        }
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

