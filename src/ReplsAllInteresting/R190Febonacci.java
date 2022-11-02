package ReplsAllInteresting;

import java.util.Iterator;
import java.util.LinkedList;

public class R190Febonacci {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<8;i++){
            list.add(i);
        }
        Iterator<Integer> iterator=list.iterator();
        int previousNum=0;
        int currentNum=1;
        int nextNum=0;
        System.out.println(previousNum+" ");
        System.out.println(currentNum+" ");
        while(iterator.hasNext()){
            iterator.next();
            nextNum=previousNum+currentNum;
            System.out.println(nextNum+" ");
            previousNum=currentNum;
            currentNum=nextNum;
        }
    }
}
