package class29FileHandling;

import Utils.ExcelReader;

import java.io.IOException;

public class Reading2 {
    public static void main(String[] args) throws IOException {

        var excelData=   ExcelReader.read("/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/SalarySyntax.xlsx");
        System.out.println(excelData);

    }
}

