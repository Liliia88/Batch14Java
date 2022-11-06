package class25Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class HW2IteratorReplaceIfSetNum {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String> drinksNames=new ArrayList<>();
        drinksNames.add("Cola");
        drinksNames.add("Fanta");
        drinksNames.add("Vodka");
        drinksNames.add("Beer");
        drinksNames.add("Vine");
        drinksNames.add("Juice");
        drinksNames.add("Smoothie");

        Iterator<String> iterator =drinksNames.iterator();
        int num=0;
        while (iterator.hasNext()){
            String item= iterator.next(); //better approach
            if(item.contains("a")||item.contains("e")){
                drinksNames.set(num,"water");
            }
            num++;
        }
        System.out.println(drinksNames);
        //-------------------------------------------
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
