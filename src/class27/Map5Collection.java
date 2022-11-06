package class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Map5Collection {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99); //kea -mango, 1.99 - value
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        Collection<Double> values=fruit.values(); // returns all the values from a map

        Iterator<Double> iterator= values.iterator(); // Getting an iterator on that  set
        while (iterator.hasNext()){
            Double item=iterator.next(); //double or Double both are work
            if(item>2){
                iterator.remove();
            }
        }

       // fruit.values().removeIf(x->x>2);
        System.out.println(fruit);

    }
}

