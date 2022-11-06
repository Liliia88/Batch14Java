package class25Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3AnotherWayAdd {
    public static void main(String[] args) {
        ArrayList<Integer> numbersEven=new ArrayList<>();
        for(int i=2;i<=500;i+=2){
            numbersEven.add(i);
        }
        Iterator<Integer> iterator =numbersEven.iterator();
        numbersEven.removeIf(x -> x%5==0);
        System.out.println(numbersEven+" ");
    }
}
