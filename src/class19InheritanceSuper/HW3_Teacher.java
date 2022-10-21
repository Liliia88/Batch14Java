package class19InheritanceSuper;

public class HW3_Teacher {
    /*
        Write a Java program called Teacher.  Identify features and behaviour of that Class.
        Create 3 subclasses MathTeacher, ChemistryTeacher
        and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
         */
    private String name1;
    private int practiceyear;
    private String subject;
    public HW3_Teacher(String name1, int practiceyear, String subject) {
        this.name1 = name1;
        this.practiceyear = practiceyear;
        this.subject = subject;
    }
    public void printInfo(){
    System.out.println("Name "+name1+" is a "+subject+" already has "+practiceyear+" year practicing.");
    }   }
  class MathTeacher extends HW3_Teacher{
      public MathTeacher(String name1, int practiceyear, String subject) {
          super(name1, practiceyear, subject);
      }   }
  class ChemistryTeacher extends HW3_Teacher{
      public ChemistryTeacher(String name1, int practiceyear, String subject) {
          super(name1, practiceyear, subject);
      }  }
  class PianoTeacher extends HW3_Teacher {
      public PianoTeacher(String name1, int practiceyear, String subject) {
          super(name1, practiceyear, subject);
      }  }
  class Tester5{
      public static void main(String[] args) {
      new MathTeacher("Mrs.Barow", 10,"math teacher").printInfo();
      new ChemistryTeacher("Mrs.Andrews", 12,"chemistry teacher").printInfo();
      new PianoTeacher ("Mrs.Molho", 19,"piano teacher").printInfo();

      }
  }
