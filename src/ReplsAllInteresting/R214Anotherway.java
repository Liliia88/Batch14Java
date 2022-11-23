package ReplsAllInteresting;
public class R214Anotherway {
    static void gradeCheck(int grade)  {
        try{
            if (grade > 90) {
                throw new SyntaxStudentException("You are an exceptionally awesome student");
            } else {
                System.out.println("You are a great student");
            }
        }
        catch(SyntaxStudentException error) {
            System.out.println(error);
        }
    }
    public static void main(String[] args) {
        gradeCheck(100);
    }
}


