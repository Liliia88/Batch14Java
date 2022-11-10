package ReplsAllInteresting;
import java.util.LinkedList;
public class R190JanelWay {
    public static void main(String[] args){
        LinkedList<Integer> fibonacci=new LinkedList<>();

        int previous=0;
        int current=1;

        for(int i=0; i<=10; i++){
            fibonacci.add(previous);
            int next=previous+current;
            previous=current;
            current=next;
        }
        for(int i=0; i<10; i++){
            System.out.print(fibonacci.get(i)+" ");
        }}
}
