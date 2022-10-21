package class17CONSTRUCTOR;

public class TEST2StudentAverageGrade {
    public static void main(String[] args) {
        HW2StudentsAverageGr student1 = new HW2StudentsAverageGr("Liliia", 67,78,89);
        student1.calculateAverageGrade();
        HW2StudentsAverageGr student2 = new HW2StudentsAverageGr("Renat", 69,98,77);
        student2.calculateAverageGrade();
        HW2StudentsAverageGr student3 = new HW2StudentsAverageGr("Arina",98,57,89);
        student3.calculateAverageGrade();
        HW2StudentsAverageGr student4 = new HW2StudentsAverageGr("Marat", 91,75,59);
        student4.calculateAverageGrade();
        HW2StudentsAverageGr student5 = new HW2StudentsAverageGr("Zoé", 94, 69,79);
        student5.calculateAverageGrade();
    }
}