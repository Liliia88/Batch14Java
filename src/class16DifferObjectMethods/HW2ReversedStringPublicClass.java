package class16DifferObjectMethods;

public class HW2ReversedStringPublicClass {
   /* Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
    */
    public static String reversWord (String sentence){
        String n=null;
        String[] words=sentence.split(" ");
        for (int i=0;i<words.length;i++){
        StringBuilder newword=new StringBuilder((words[i]));
        n+=(newword.reverse()+" ");
     } return n;
    }
    public static void main (String[]args){
        System.out.print(reversWord("Public static void"));
    }
}
