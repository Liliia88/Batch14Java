package ReplsAllInteresting;

import java.util.LinkedList;

public class R192AnotherWayLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> primeNum = new LinkedList<>();

        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum.add(i);
            }
        }
        System.out.println(primeNum);
    }
}
