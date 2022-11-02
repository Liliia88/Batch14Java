package ReplsAllInteresting;
import java.util.Iterator;
import java.util.LinkedList;
public class R192PrimeOrNot {
    public static void main(String[] args) {
        LinkedList<Integer> primeNum = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            primeNum.add(i);
        }
        Iterator<Integer> iterator = primeNum.iterator();

        while (iterator.hasNext()) {
            int a = iterator.next();
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    iterator.remove();
                    break;
                }
            }
        } System.out.println(primeNum);
    }
}
