package class16DifferObjectMethods;
public class SergeiTaskAnotherway {
    /*
     /* Дали String aaaabbcccccddaa
    Надо получить a4b2c5d2a2
     */
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aaaabbcccccddaa"));
    }
    public static String removeConsecutiveDuplicates(String input) {
        String word="";

        String[] letters=input.split("");
        for (int a = 0; a < letters.length-1; a++) {
            int count=0;
            for (int b = a+1; b < letters.length; b++) {
                if (letters[a].equals(letters[b])) {
                    count++;
                }
            }word+=letters[a]+count;
            }
        return word.trim();
            }


        }




