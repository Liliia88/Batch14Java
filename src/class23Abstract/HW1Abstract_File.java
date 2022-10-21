package class23Abstract;

public abstract class HW1Abstract_File {
    /*Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented
    method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc
    file we need Microsoft word to be installed etc*/
    abstract void open();
    abstract void edit();
    abstract void close();

}
class JavaFile extends HW1Abstract_File{

    @Override
    void open() {
        System.out.println("You need to use notepad");
    }

    @Override
    void edit() {
        System.out.println("You need to open JavaFile and edit it");
    }

    @Override
    void close() {
        System.out.println("Close your Java file");
    }
}
class WordFile extends HW1Abstract_File{

    @Override
    void open() {
        System.out.println("You need to use MicrosoftWord");
    }

    @Override
    void edit() {
        System.out.println("You need to open to MicrosoftWord document and edit it");
    }

    @Override
    void close() {
        System.out.println("Close your MicrosoftWord document");
    }
}
 class PdfFile extends HW1Abstract_File{

     @Override
     void open() {
         System.out.println("You need to use PdF programm");
     }

     @Override
     void edit() {
         System.out.println("You need to open to Pdf file and edit it");
     }

     @Override
     void close() {
         System.out.println("Close your PdfFile");
     }
 }
 class testerFile{
     public static void main(String[] args) {
         HW1Abstract_File[] javafile = {new JavaFile(), new WordFile(), new PdfFile()};
         for (HW1Abstract_File java : javafile) {
             java.open();
             java.edit();
             java.close();
         }
     }}

