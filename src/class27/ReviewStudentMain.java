package class27;

import java.util.ArrayList;

public class ReviewStudentMain {
    public static void main(String[] args) {
        ArrayList<ReviewStudent> students = new ArrayList<>();
        students.add(new ReviewStudent("Josh", "Plantin", "123"));
        students.add(new ReviewStudent("Adam", "Park", "123"));
        students.add(new ReviewStudent("Yusuf", "Engin", "123"));
        students.add(new ReviewStudent("Cam", "Jo", "123"));
        // System.out.println(students);

        // coming up next how we can remove elements how we can access methods from a class

       /* for (Student student : students) {
            student.printName();
        }*/

        ReviewStudent joshAgain = new ReviewStudent("Josh", "Plantin", "123");
        System.out.println(students.contains(joshAgain));
        System.out.println(joshAgain);
        System.out.println(students);
    }
}
