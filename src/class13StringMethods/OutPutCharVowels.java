package class13StringMethods;
import java.util.Scanner;
public class OutPutCharVowels {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            char[] charArray=word.toCharArray();

            for (char c:charArray) {
                if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                    System.out.print(c);
                }
            }   System.out.println("---------------");
            System.out.println(word.toLowerCase().replaceAll("[^aeiou]",""));
        }
    }

