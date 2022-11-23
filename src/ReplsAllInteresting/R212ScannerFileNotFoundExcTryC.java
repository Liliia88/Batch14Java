package ReplsAllInteresting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class R212ScannerFileNotFoundExcTryC {

    static void methodCall()throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("path");
      //  Scanner input = new Scanner(new File(""));
    }

    public static void main(String[]args){
        try{
            R212ScannerFileNotFoundExcTryC.methodCall();
        } catch (FileNotFoundException error){
            System.out.println(error);
        }

    }

}

