package class29FileHandling;

import Utils.ConfigReader;
import Utils.ExcelReader;

import java.io.IOException;

public class FilesDemoConfigReader {
    public static void main(String[] args) throws IOException {
        String path="/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/config.properties";
        var properties=  ConfigReader.read(path);
        System.out.println(properties.getProperty("URL"));


        String excelPath="/Users/liliya.khusainova/Documents/QAStudy/SDETBatch14Java/Data/SalarySyntax.xlsx";
        var excelData=  ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}
