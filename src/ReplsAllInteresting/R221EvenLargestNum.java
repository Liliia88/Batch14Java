package ReplsAllInteresting;

public class R221EvenLargestNum {
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("Hello world!"));
    }

    public static String findMaxLenEven(String str) {

        String[] words=str.split(" ");
        String largest="";
        for (String word:words){
            if(word.length()>largest.length() && word.length()%2==0){
                largest=word;
            } else if (word.length()%2!=0){
                System.out.println(-1);
            }
        }
        return largest;
    }
}

