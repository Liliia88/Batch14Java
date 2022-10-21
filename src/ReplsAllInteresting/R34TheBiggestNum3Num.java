package ReplsAllInteresting;

import java.util.Scanner;

public class R34TheBiggestNum3Num {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter 3 distinct numbers");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("The largest number is "+a);
            } else if (a<c){
                System.out.println("The largest number is "+c);
            }
        } else if (b>c) {
            System.out.println("The largest number is "+b);
        } else {
            System.out.println("The largest number is "+c);
        }
        scanner.close();
    }
}
