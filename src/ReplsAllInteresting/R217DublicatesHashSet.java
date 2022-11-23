package ReplsAllInteresting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class R217DublicatesHashSet {
    static int countDuplicates(List<Integer> numbers) {
        System.out.println(numbers);
        //int sum = 0;
        HashSet<Integer> hashSet=new HashSet<>();
        for (int a = 0; a < numbers.size(); a++) {
            int num=0;
            for (int l = a + 1; l < numbers.size(); l++) {
                if (numbers.get(a) == numbers.get(l)) {
                    hashSet.add(numbers.get(a));
                    break;
                }
            }
        }
        return hashSet.size();
    }
    public static void main(String[] args) {
        // System.out.println("Hello World");
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(12);
        num.add(7);
        num.add(7);
        num.add(7);
        num.add(7);
        num.add(7);
        System.out.println(countDuplicates(num));
    }
}
