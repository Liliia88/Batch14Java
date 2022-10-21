package class14CreateObjMethodes;

import java.util.Scanner;
public class HW3Palindrome {
    void palindrome(String word) {
        word=word.toLowerCase();
        StringBuilder newword = new StringBuilder(word);
        newword=newword.reverse();
        if (newword.toString().equals(word)) {
            System.out.print("it is a palindrome");
        } else {
            System.out.print("it is not a palindrome");
        }
    }
    public static void main(String[] args) {
        HW3Palindrome w=new HW3Palindrome();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Print any word");
        String word=scanner.next();
        w.palindrome(word);
        }}
