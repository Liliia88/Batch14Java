package ReplsAllInteresting;

import java.util.ArrayList;
import java.util.Scanner;

public class R188AnotherWay {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        for(Integer n:numbers){
            System.out.print(n+" ");
        }
    }
}
