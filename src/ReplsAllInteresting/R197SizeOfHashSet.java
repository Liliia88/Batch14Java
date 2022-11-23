package ReplsAllInteresting;

import java.util.HashSet;

public class R197SizeOfHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        hashSet.add("White");
        hashSet.add("Black");
        System.out.println("Original Hash Set: "+hashSet);
        System.out.println("Size of the Hash Set: "+hashSet.size());
    }
}

