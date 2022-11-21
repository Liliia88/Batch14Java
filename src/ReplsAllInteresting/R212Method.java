package ReplsAllInteresting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class R212Method {

    static void methodCall()throws FileNotFoundException {
        Scanner input = new Scanner(new File(""));
    }

    public static void main(String[]args){
        try{
            R212Method.methodCall();
        } catch (FileNotFoundException error){
            System.out.println(error);
        }

    }

}

