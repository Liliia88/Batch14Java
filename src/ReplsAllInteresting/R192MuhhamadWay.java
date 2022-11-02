package ReplsAllInteresting;

import java.util.LinkedList;

public class R192MuhhamadWay {

        public static void main (String[]args){
            LinkedList<Integer> primeNum = new LinkedList<>();

            for (int i=2;i<=100;i++){
                int prime=0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime++;
                    }
                }
                if (prime==0) {
                    primeNum.add(i);
                }
            }
            System.out.println(primeNum);
        }
    }


