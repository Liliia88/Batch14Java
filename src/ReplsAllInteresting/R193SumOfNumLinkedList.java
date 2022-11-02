package ReplsAllInteresting;
import java.util.Iterator;
import java.util.LinkedList;
public class R193SumOfNumLinkedList {
        public static void main (String[]args){
            LinkedList<Integer> numbers=new LinkedList<>();
            for(int i=111;i<=666;i+=111){
                numbers.add(i);
            }
            Iterator<Integer> iterator =numbers.iterator();
            int sum=0;
            while (iterator.hasNext()){
                int a=iterator.next();
                sum+=a;
            }  System.out.println("Result of sum is "+sum);
        }}
    



