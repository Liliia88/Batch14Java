package class13ReviewArraysString;

public class Task5SecondWayPalindromeStringBuilder {
    public static void main(String[] args) {

        String word = "radar";
        StringBuilder newword = new StringBuilder(word);
        if (word.equalsIgnoreCase(String.valueOf(newword.reverse()))) {
            System.out.print(word + " is a palindrome");
        } else  {
            System.out.print(word + " is not a palindrome");

        }

    }
}
