package ReplsAllInteresting;

public class R168ReverseFinalM {
    final void main(String word){
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
    public static void main(String[]args){
        new R168ReverseFinalM().main("hello");
    }
}

