package class25Iterator;
import java.util.ArrayList;
import java.util.Iterator;
public class HW1EndsWithRemoveLambda {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */
        ArrayList<String> girlsNames=new ArrayList<>();
        girlsNames.add("Liliia");
        girlsNames.add("Evie");
        girlsNames.add("Arina");
        girlsNames.add("Zoe");
        girlsNames.add("Alora");
        girlsNames.add("Kate");
        girlsNames.add("Tatiana");
        girlsNames.add("Kelly");
        girlsNames.add("Erica");
        girlsNames.add("Gracie");

        Iterator<String> iterator =girlsNames.iterator();
       // while (iterator.hasNext()){
       //     if(iterator.next().endsWith("e")){
       //         iterator.remove();
         //   }
       // }
        girlsNames.removeIf(x -> x.endsWith("e"));
        System.out.println(girlsNames);
    }
}
