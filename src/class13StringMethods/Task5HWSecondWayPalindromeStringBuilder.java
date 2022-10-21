package class13StringMethods;

public class Task5HWSecondWayPalindromeStringBuilder {
    public static void main(String[] args) {

        String word = "radar";
        StringBuilder newword = new StringBuilder(word);
        newword=newword.reverse();
        if (word.equalsIgnoreCase(newword.toString())) {
            System.out.print(word + " is a palindrome");
        } else  {
            System.out.print(word + " is not a palindrome");

        }

    }
}
