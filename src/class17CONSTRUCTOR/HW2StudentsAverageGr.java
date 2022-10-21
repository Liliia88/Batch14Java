package class17CONSTRUCTOR;

public class HW2StudentsAverageGr {
  /*  Write a java Class Students that have a constructor which takes students name
    and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.

   */
    String name;
    int grade1;
    int grade2;
    int grade3;
    int avaragescore;

    public HW2StudentsAverageGr(String name, int math, int reading, int spanishclass) {
        name = name;
        grade1 = math;
        grade2 = reading;
        grade3 = spanishclass;
    }
    public void calculateAverageGrade() {
        System.out.println(avaragescore=(grade1+grade2+grade3)/3);
    }
    }
