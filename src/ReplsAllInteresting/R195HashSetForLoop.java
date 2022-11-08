package ReplsAllInteresting;

import java.util.HashSet;

public class R195HashSetForLoop {
    public static void main (String []args){
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(999);
        hashSet.add(999);
        hashSet.add(999);
        for(Integer set:hashSet){
            System.out.println(set);
        }

    }
}

