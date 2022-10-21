package ReplsAllInteresting;

import java.util.Scanner;

public class R41Switch {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age=scanner.nextInt();
        String result;

        switch (age){
            case 1:
                result="You can Crawl";
                break;
            case 2:
                result="You can Talk";
                break;
            case 3:
                result="You can Dance";
                break;
            case 4:
                result="You can get Trouble";
                break;
            default:
                result="I don't know how old you are";
                break;
        }
        System.out.println(result);
        scanner.close();
}}
