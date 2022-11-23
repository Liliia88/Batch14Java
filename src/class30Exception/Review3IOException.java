package class30Exception;

import Utils.ExcelReaderMethod;

import java.io.IOException;

public class Review3IOException {
    public static void main(String[] args)  {

        try{
            ExcelReaderMethod.read("dkjbfkjdbf");}
        catch (IOException e){
            System.out.println("Please contact our support team at support@syntax.com");
        }

    }
}

