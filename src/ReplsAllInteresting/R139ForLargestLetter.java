package ReplsAllInteresting;

public class R139ForLargestLetter {
    public String alphabetical(String str){
        String result_word="";
        for (int i=0;i<str.length()-1;i+=2){

            if (str.charAt(i)>str.charAt(i+1)){
                result_word=result_word+str.charAt(i);
            } else {
                result_word=result_word+str.charAt(i+1);
            }
        }
        if (str.length()%2!=0){
            result_word=result_word+str.charAt(str.length()-1);
        }
        return result_word;
    }

    public static void main(String[]args){
        R139ForLargestLetter main=new R139ForLargestLetter();
        System.out.println(main.alphabetical("hello"));
        System.out.println(main.alphabetical("software"));
        System.out.println(main.alphabetical("language"));
    }
}
