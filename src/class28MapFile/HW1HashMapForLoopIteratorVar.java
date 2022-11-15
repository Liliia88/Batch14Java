package class28MapFile;

import java.util.HashMap;

public class HW1HashMapForLoopIteratorVar {
    public static void main(String[] args) {
        /*
Create a map of a building. Store floor number and it is associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
         */
        HashMap<Integer,String> floors=new HashMap<>();
        floors.put(1,"Mazda");
        floors.put(2,"Toyota");
        floors.put(3,"Porch");
        floors.put(4,"Mitsubishi");
        floors.put(5,"Ford");
        floors.put(6,"Hyundai");
        floors.put(7,"Audi");
        System.out.println("There are "+floors.size()+" floors in a building");
        floors.put(4,"Google");
        System.out.println("An update name of company on a 4th floor is "+floors.get(4));

        var entries2 = floors.entrySet().iterator();
        while (entries2.hasNext()) {
            var entry2 = entries2.next();
            System.out.print(entry2.getKey() + ":" + entry2.getValue()+"; ");
        }
        /*
        for ( var f :  floors.entrySet()) {
            Integer key = f.getKey();
            String value = f.getValue();
            System.out.print(key+":"+value+"; ");
        }
        */

        System.out.println("");
        System.out.println(floors);
        floors.remove(7);

        var entries = floors.entrySet().iterator();
        while (entries.hasNext()) {
            var entry = entries.next();
            System.out.print(entry.getKey() + ":" + entry.getValue()+"; ");
        }
        System.out.println();
        System.out.println(floors);
    }
}
