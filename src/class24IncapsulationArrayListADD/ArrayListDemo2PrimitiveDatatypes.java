package class24IncapsulationArrayListADD;

import java.util.ArrayList;

public class ArrayListDemo2PrimitiveDatatypes {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);
        //int=> Integer
        //boolean=>Boolean
        //byte=>Byte
        //double=>Double
        //long=Long
        //float=>Float
        //char=Character

    }
}
