package ReplsAllInteresting;

import java.util.Scanner;

public class R40IFSwitch {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String name=scanner.next();
        String result;

        switch (name){
            case "Asghar":
                result=" Will take care of Java Assignment";
                break;
            case "Moazzam":
                result=" Will take care of SDLC Assignment";
                break;
            case "Weqas":
                result=" Will take care of Selenium Assignment";
                break;
            case "Asel":
                result=" Will take care of every Assignment";
                break;
            default:
                result=" Invalid instructor selected";
                break;
        }
        System.out.println(name+result);
        scanner.close();
}}
