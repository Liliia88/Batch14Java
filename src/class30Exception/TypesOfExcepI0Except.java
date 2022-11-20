package class30Exception;

import Utils.ExcelReaderMethod;

import java.io.IOException;
public class TypesOfExcepI0Except {
    public static void main(String[] args) {
/*
        String name = null;
        if (name != null) {
            System.out.println(name.length());
        }

        int [] arr=new int[5];
        int index=10;

        try {
            System.out.println(arr[index]);
        }catch(Exception e){
            System.out.println("Josh");
        }
*/
        try {
            System.out.println(ExcelReaderMethod.read("/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/Test.xlsx"));
        } catch (IOException e) {
            System.out.println("backup code");
        } catch (NullPointerException e){

        }
    }
}
