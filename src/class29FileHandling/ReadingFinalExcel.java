package class29FileHandling;

import Utils.ExcelReaderMethod;

import java.io.IOException;

public class ReadingFinalExcel {
    public static void main(String[] args) throws IOException {

        var finalExcel1Data=   ExcelReaderMethod.read("/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/SalarySyntax.xlsx", "Sheet1");
        System.out.println(finalExcel1Data);

        var excelData2=   ExcelReaderMethod.read("/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/SalarySyntax.xlsx", "Sheet2");
        System.out.println(excelData2);

    }
}

