package ReplsAllInteresting;

import java.util.Scanner;

public class R76DaysOfWeekScannerFor {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        int[]numbers=new int[7];
        System.out.println("Please enter Days of the week");
        String[] days=new String[7];
        for (int i=0;i<numbers.length+1;i++){
            days[i]=scanner.next();
            System.out.println(days[i]);
        }
        scanner.close();
    }
}
