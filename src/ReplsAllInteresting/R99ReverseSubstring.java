package ReplsAllInteresting;

import java.util.Scanner;

public class R99ReverseSubstring {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean b=true;
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        StringBuilder word=new StringBuilder(givenString);
        if(givenString.equalsIgnoreCase(String.valueOf(word.reverse()))) {
            System.out.print(b);
        } else  {
            System.out.print(!b);
        }

        inp.close();
    }
}
