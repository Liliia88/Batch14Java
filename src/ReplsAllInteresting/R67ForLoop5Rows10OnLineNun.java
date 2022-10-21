package ReplsAllInteresting;

public class R67ForLoop5Rows10OnLineNun {
    public static void main(String[] args) {

    for (int a=1; a<=5; a++){

        for (int b=1; b<=10; b++){

            System.out.print(a*b+" ");
        }System.out.println();
    }

        for (int a=1; a<=5; a++){
            int c=0;
            for (int b=1; b<=10; b++){
                int x=c+=a;
                System.out.print(x+" ");
            }System.out.println();
        }
}}
