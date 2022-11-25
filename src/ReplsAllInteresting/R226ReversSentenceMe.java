package ReplsAllInteresting;

public class R226ReversSentenceMe {
    public static void main(String[] args) {
        System.out.println(reverse("I am a java Programmer"));
    }
    public static String reverse(String strToRev){
        String word="";
        String[] letters=strToRev.split(" ");
        for (int c=letters.length-1;c>=0;c--){
            word+=letters[c]+" ";

        }
        return word.trim();
    }

}
