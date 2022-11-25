package ReplsAllInteresting;
import java.util.ArrayList;
import java.util.List;
public class R218RenatWay {
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
        for (int a = 0; a < deviceNames.size(); a++) {
            int number=1;
            for (int l = a + 1; l < deviceNames.size(); l++) {
                if (deviceNames.get(a) == deviceNames.get(l)) {
                    deviceNames.set(l,deviceNames.get(l)+(number));
                    number++;
                }
            }
        }
        return deviceNames;
    }}

