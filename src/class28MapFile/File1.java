package class28MapFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//rightclick on your file and click copypathreference then click from Content root
public class File1 {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties"; // location of the file
       var fileInputStream=new FileInputStream(path); // it helps us navigate to the file
       var properties=new Properties();
       properties.load(fileInputStream); // loads all the data from the file inside (Memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();
    }
}
