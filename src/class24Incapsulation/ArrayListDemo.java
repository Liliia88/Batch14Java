package class24Incapsulation;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Syntax to create an arrayList

        ArrayList<String> colors=new ArrayList<>();
        //use add method to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        //prints all the elements
        System.out.println(colors);
        //get methods prints individual elements from arrayList
        System.out.println(colors.get(0));
        //size me
        System.out.println(colors.size());
//getting all the elements from arrayList by normal loop
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
//getting all the elements from arrayList by enhanced loop
        System.out.println("---------------------------");
        for(String color:colors){
            System.out.println(color);
        }
    }
}
