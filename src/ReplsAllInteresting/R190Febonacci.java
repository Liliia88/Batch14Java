package ReplsAllInteresting;

import java.util.Iterator;
import java.util.LinkedList;

public class R190Febonacci {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        Iterator<Integer> iterator=list.iterator();
        int previousNum=0;
        int currentNum=1;
        int nextNum=0;
        while(iterator.hasNext()){
            iterator.next();
            nextNum=previousNum+currentNum;
            System.out.print(previousNum+" ");
            previousNum=currentNum;
            currentNum=nextNum;
        }
    }
}
