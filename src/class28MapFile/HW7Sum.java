package class28MapFile;

import java.util.ArrayList;

public class HW7Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        int sum=0;
        for(Integer n:numbers){
            sum=sum+n;
        }
        System.out.println("Sum of numbers is "+sum);
    }
}
