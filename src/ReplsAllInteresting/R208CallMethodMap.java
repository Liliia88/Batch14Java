package ReplsAllInteresting;
import java.util.HashMap;
import java.util.Map;
public class R208CallMethodMap {
        void display ( Map<String,Integer> map){

            if(map.isEmpty()){
                System.out.println("map is empty");
            }
            else{
                for(var m:map.entrySet()){
                    System.out.println(m.getKey()+" : "+m.getValue());
                }
            }
        }
        public static void main(String[] args) {
            Map<String,Integer> map=new HashMap<>();
            map.put("mango", 10);
            map.put("apple", 30);
            map.put("orange", 20);

            R208CallMethodMap object=new R208CallMethodMap();
            object.display(map);
            map.clear();
            object.display(map);
        }
    }


