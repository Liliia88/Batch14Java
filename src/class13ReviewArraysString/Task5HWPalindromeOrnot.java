package class13ReviewArraysString;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Task5HWPalindromeOrnot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Please enter any word");
        String word = scanner.next();

       for (int i = word.length() - 1; i >= 0; i--) {
          char w= word.charAt(i);
      }
        if (word.equals('w')) {
            out.println(word + " is a palindrome");
        } else {
            out.println(word + " is not a palindrome");
        }
        out.println("--------------------");
    }}