package ReplsAllInteresting;

import java.util.Scanner;

public class R77ScannerForNum {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        int[]numbers=new int [5];

        for(int a=0; a<numbers.length;a++){
            numbers[a]=scanner.nextInt();
            for (int b=numbers[a]-1; b>=0;b--)
                System.out.println(numbers[b]);

        }



    }
}
