package class25Iterator;

import java.util.ArrayList;
public class HW3IteratorRemoveDIFFERWAYS {
    public static void main(String[] args) {
/*
Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
 */
        ArrayList<Integer> numbersEven=new ArrayList<>();

        for(int i=0;i<=500;i+=2){
            if(i%5!=0){
                numbersEven.add(i);
           }
        }
        System.out.println(numbersEven+" ");
        System.out.println("------------------------------------");

        /*
        ArrayList<Integer> numbersEven=new ArrayList<>();
         for(int i=2;i<=500;i+=2){
         numbersEven.add(i);
         }
       ------------using iterator---------------
         Iterator<Integer> iterator =numbersEven.iterator();

          while (iterator.hasNext()){
            if(iterator.next()%5==0){
              iterator.remove();
            }
        }
         System.out.println(numbersEven+" ");
        -------------- or using Lambda--------------------------
        numbersEven.removeIf(x -> x%5==0);
        System.out.println(numbersEven+" ");
         */
    }
}
