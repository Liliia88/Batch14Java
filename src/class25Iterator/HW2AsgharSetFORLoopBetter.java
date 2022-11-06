package class25Iterator;

import java.util.ArrayList;

public class HW2AsgharSetFORLoopBetter {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Milk");
        drinks.add("ChocolateMilk");
        drinks.add("StrawberryMilk");
        drinks.add("CoconutMilk");

        for(int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
