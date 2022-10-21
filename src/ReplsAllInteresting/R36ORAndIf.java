package ReplsAllInteresting;

import java.util.Scanner;

public class R36ORAndIf {
    public static void main (String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1=scanner.next();
        String word2=scanner.next();
        System.out.println("Please enter two numbers");
        int int1=scanner.nextInt();
        int int2=scanner.nextInt();
        String result=null;

        if ((int1==int2) && (word1.equals(word2))) {
            result="AND";
        }
        else if (int1==int2 || word1.equals(word2)) {
            result="OR";
        } else if ((int1!=int2) && (!word1.equals(word2))){
            result="NONE";
        }
        System.out.println("Your result is "+result);
        scanner.close();
}}
