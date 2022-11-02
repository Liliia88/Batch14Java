package class24EncapsulatArrListADDCollectFramework;

import java.util.ArrayList;

public class HWEmptyContains {
    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */

    //Non generic way of using collections framework ,
    // this is how your ancestors use to write code before java 1.5, it causes a lof of problems
    // at run time because java don't know at compile time what type of data you are storing in this class and because
    //java does not know it can't help you avoid these errors

    /* ArrayList names=new ArrayList();
     names.add("Serh");
     names.add(10);
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //set - is for replacing some element
        names.add("Liliia");
        names.add("Arina");
        names.add("Marat");
        names.add("Renat");
        names.add("Zoe");
         if(names.isEmpty()){
             System.out.println("ArrayList is empty");
         } else{
             System.out.println("ArrayList is not empty");
         }

         if(names.contains("Irina")){
             System.out.println("ArrayList has element Irina");
         } else{
             System.out.println("Sorry, ArrayList doesn't contain such element");
         }
        System.out.println(names.size());
        System.out.println(names);

        /*
        ArrayList<String> names=new ArrayList<>(5);
        names.add("Nesrin");
        names.add("Vidaya");
        names.add("Jam");
        names.add("Jamo");
        names.add("Jami");
        System.out.println(names.isEmpty()); //given ArrayList is empty or not?
        System.out.println(names.contains("Jam"));
        System.out.println(names.contains("Dam"));
        System.out.println(names.size());
        System.out.println(names);
         */
    }
}
