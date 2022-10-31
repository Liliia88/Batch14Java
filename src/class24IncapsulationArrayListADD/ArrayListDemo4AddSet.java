package class24IncapsulationArrayListADD;

import java.util.ArrayList;

public class ArrayListDemo4AddSet {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //set - is for replacing some element
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Josh");
        names.set(2,"Josh Again");
        System.out.println(names);

        //add - we add some element
        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);
        numbers.add(1,100);
        System.out.println(numbers);
        numbers.clear();//delete all the elements from the list
        System.out.println(numbers);
    }
}
