package class27;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReviewSet {
    public static void main(String[] args) {
    /*
    if we don't override equals method in our custom classes most of the collections framework will not
    work properly with those classes
     */
        Set<ReviewStudent> students = new LinkedHashSet<>(); //upcasting
        students.add(new ReviewStudent("Josh", "plantin", "123"));
        students.add(new ReviewStudent("Saira", "Jawad", "245"));
        students.add(new ReviewStudent("Mihan", "Kalani", "4565"));
        students.add(new ReviewStudent("Sonam", "Koh", "100"));
        System.out.println(students);

        List<ReviewStudent> setStudents = new ArrayList<>(students);
        System.out.println(setStudents.get(1));

    }
}
