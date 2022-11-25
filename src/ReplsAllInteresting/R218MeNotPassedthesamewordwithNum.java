package ReplsAllInteresting;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class R218MeNotPassedthesamewordwithNum {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("switch");
        words.add("tv");
        words.add("switch");
        words.add("tv");
        words.add("switch");
        words.add("tv");
        words.add("radio");

        System.out.println(words);
        System.out.println(countDeviceNames(words));
    }
    public static List<String> countDeviceNames(List<String> deviceNames) {
        LinkedList<String> newNames = new LinkedList<>();
        int number=1;
        for (int a = 0; a < deviceNames.size(); a++) {
            newNames.add(deviceNames.get(a));
           // newNames.add(deviceNames.get(a+1));
            for (int l = a + 1; l < deviceNames.size(); l++) {
                if (deviceNames.get(a) == deviceNames.get(l)) {

                    newNames.add(deviceNames.get(l)+(number));
           //         newNames.add(deviceNames.get(a+1)+(number));
                    number++;
                }
            }
          //  break;

        }
        return newNames;
    }}