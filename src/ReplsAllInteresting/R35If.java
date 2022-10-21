package ReplsAllInteresting;

import java.util.Scanner;

public class R35If {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        Boolean loan=scanner.nextBoolean();
        if(loan){
            System.out.println("What is your credit score?");
            Double score=scanner.nextDouble();
            String result=null;

            if (score<600) {
                result="Not eligible";
            } else if (score>=600 && score<=700){
                result="Maybe eligible";
            } else if (score>=701 && score<=800){
                result="Eligible";
            } else if (score>800){
                result="Definitely eligible";
            }
            System.out.println("The eligibility is "+result);

        } else {
            System.out.println("Unknown");
        }
        scanner.close();
}}
