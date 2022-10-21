package ReplsAllInteresting;

public class R79Arrays2D {
    public static void main(String[] args) {
        String[][] numbers={{"1.4","2.0","3.3","2.0"},
                {"4.0","1.5","6.1","1.0"},
                {"1.2","3.1","4.0","1.6"}
        };
        for(String[] num:numbers) {
            for (String n:num) {
                System.out.print(n+" ");
            } System.out.println();
        }
    }
}
