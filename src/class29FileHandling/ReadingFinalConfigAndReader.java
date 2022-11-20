package class29FileHandling;

import Utils.ConfigReaderMethod;
import Utils.ExcelReaderMethod;

import java.io.IOException;

public class ReadingFinalConfigAndReader {
    public static void main(String[] args) throws IOException {
        String path="/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/config.properties";
        var properties=  ConfigReaderMethod.read(path);
        System.out.println(properties.getProperty("URL"));


        String excelPath="/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/SalarySyntax.xlsx";
        //overloading
        var excelData=  ExcelReaderMethod.read(excelPath);
        System.out.println(excelData);
        //overloading
        var excelData2=  ExcelReaderMethod.read(excelPath,"Sheet2");
        System.out.println(excelData2);
    }
}
