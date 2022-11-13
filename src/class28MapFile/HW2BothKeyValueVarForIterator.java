package class28MapFile;
import java.util.TreeMap;
public class HW2BothKeyValueVarForIterator {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
                Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
        */
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Russia","Moscow");
        countries.put("USA","Washington.D.C.");
        countries.put("Spain","Madrid");
        countries.put("Argentina","Buenos Aires");
        countries.put("Australia","Canberra");
        for(var c:countries.entrySet()){
            System.out.println("The capital of "+c.getKey() + " is " + c.getValue());
        }
        System.out.println("-----------------");

        var count=countries.entrySet().iterator();
        while(count.hasNext()){
            var co=count.next();
            System.out.println("The capital of "+co.getKey() + " is " + co.getValue());
        }
        System.out.println("----------------");

        for(var c:countries.values()){
            System.out.println("City is " + c);
        }
        System.out.println("-----------------");

        var city=countries.values().iterator();
        while(city.hasNext()){
            var ci=city.next();
            System.out.println("City is " + ci);
        }
    }
}
