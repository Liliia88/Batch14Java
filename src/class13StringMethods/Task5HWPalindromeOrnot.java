package class13StringMethods;

import java.util.Scanner;

import static java.lang.System.*;

public class Task5HWPalindromeOrnot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Please enter any word");
        String word = scanner.next();

       for (int i = word.length() - 1; i >= 0; i--) {
          char w = word.charAt(i);
      }
        if (word.equals('w')) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
        System.out.println("--------------------");
    }}