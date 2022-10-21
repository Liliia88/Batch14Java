package ReplsAllInteresting;

public class R68SquareDollForLoop {
    public static void main(String[] args) {
        int length = 4;
        for (int a = 1; a <= length; a++) {
            for (int b = 1; b <= length; b++) {
                if (a > 1 && a < length && b > 1 && b < length) {
                    System.out.print(" ");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
    }
}
