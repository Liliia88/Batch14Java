package class24IncapsulationArrayListADD;

import java.util.ArrayList;

public class ArrayListDemo3BooleanCharsFloats {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5F);
        floats.add(12F);
        System.out.println(floats);
    }
}
