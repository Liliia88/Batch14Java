package ReplsAllInteresting;

public class R220RenatWay {
    public static void main(String[] args) {
        System.out.println(formatString("00-44 #$% 48 55"));
    }
    public static String formatString(String str){
        String[] results = str.replaceAll("[^a-zA-Z0-9]", "").split("(?<=\\G.{" + 3 + "})");
        return String.join("-", results);
    }
}

