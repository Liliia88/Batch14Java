package class22Polymorphism;
public class HW1_StudentPolymorphism {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism*/
    void studenttype(){
        System.out.println("I'm a student");
    }
    void studyway()
    {
        System.out.println("I study");
    }
}
class SyntaxStudent extends HW1_StudentPolymorphism {
    void studenttype(){
        System.out.println("I'm a SyntaxS student");
    }
    void studyway()
    {
        System.out.println("I study online");
    }
}
class CollegeStudent extends HW1_StudentPolymorphism {
    void studenttype(){
        System.out.println("I'm a College student");
    }
    void studyway()
    {
        System.out.println("I study offline and online");
    }
}
class SchoolStudent extends HW1_StudentPolymorphism {
    void studenttype(){
        System.out.println("I'm a School student");
    }
    void studyway()
    {
        System.out.println("I study offline");
    }
}
class classtester22{
    public static void main(String[] args) {
       // HW1_StudentPolymorphism[] students;
        HW1_StudentPolymorphism[] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (HW1_StudentPolymorphism student:students) {
            student.studenttype();
            student.studyway();
        }
    }
}
