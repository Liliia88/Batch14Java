package class30Exception;

import Utils.ConfigReaderMethod;

import java.io.IOException;

public class Review1NoSuchFile {
    public static void main(String[] args) throws IOException {
        ConfigReaderMethod.read("skjdbfjsdhbf");
        System.out.println("important line of code");
        //Break till 9:10

    }
}
