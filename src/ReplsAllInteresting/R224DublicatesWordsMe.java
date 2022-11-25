package ReplsAllInteresting;

public class R224DublicatesWordsMe {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
    }

    public static String removeConsecutiveDuplicates(String input) {
        String word="";
        String[] letters=input.split("");
        for (int a = 0; a < letters.length-1; a++) {
            if((!letters[a].equals(letters[a+1]))||
                    (!word.contains(letters[a]))){
                word+=letters[a+1];
            }
        }
        return word;
    }

}