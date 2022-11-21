package ReplsAllInteresting;

 class R214 {

        static void gradeCheck(int grade) throws SyntaxStudentException {
            if (grade > 90) {
                throw new SyntaxStudentException("You are an exceptionally awesome student");
            } else {
                System.out.println("You are a great student");
            }
        }

        public static void main(String[] args) {
            try {
                R214.gradeCheck(100);
            } catch (SyntaxStudentException error) {
                System.out.println(error);
            }

        }

    }
 class SyntaxStudentException extends Exception {
    public SyntaxStudentException(String message)
    { super(message);
    }
}


