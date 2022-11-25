package ReplsAllInteresting;
import java.util.ArrayList;
import java.util.List;
public class R219PrefixesMe {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("steve");
        list1.add("stevens");
        list1.add("danny");
        list1.add("steves");
        list1.add("dan");
        list1.add("john");
        list1.add("johny");
        list1.add("joe");
        list1.add("alex");
        list1.add("alexander");

        List<String> list2=new ArrayList<>();
        list2.add("steve");
        list2.add("alex");
        list2.add("joe");
        list2.add("john");
        list2.add("dan");
        System.out.println(countOnlyPrefixes(list1,list2));
    }
    public static List<Integer> countOnlyPrefixes(List<String> names,List<String> query){

        List<Integer> prefixes=new ArrayList<>();
        for (int i=0;i<query.size();i++){
            int count=0;
            for (int h=0;h<names.size();h++){
                if(names.get(h).startsWith(query.get(i))&& !names.get(h).equalsIgnoreCase(query.get(i))){
                    count++;
                }
            }
            prefixes.add(count);
        }
        return prefixes;
    }
}
