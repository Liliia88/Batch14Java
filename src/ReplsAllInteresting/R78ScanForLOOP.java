package ReplsAllInteresting;

import java.util.Scanner;

public class R78ScanForLOOP {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int [5];
        int c=10;
        for (int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
            for(int j=numbers[i];j<=numbers.length;j++){

                System.out.println(j*c);
            }
        }
    }
}
