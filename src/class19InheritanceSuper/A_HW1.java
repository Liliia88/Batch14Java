package class19InheritanceSuper;

public class A_HW1 {
    /* Write program for multilevel inheritance
        where class C inherits from class B and Class B inherits from Class A.*/
    String name;
    int grade;
    String schoolname;
}

class B1 extends A_HW1 {
    String teacherName = "Mrs.Andrews";
}

class C extends B1 {
    void study() {
        System.out.println("My daughter " + name + " studies at " + schoolname + " in " + grade + " grade and her teacher " +
                teacherName + " is the best!");
    }
}

class tester2 {
    public static void main(String[] args) {
        C c = new C();
        c.name = "Arina";
        c.grade = 2;
        c.schoolname = "Stowers Elementary";
        c.study();
    }
}

