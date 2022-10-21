package ReplsAllInteresting;

public class R140LargestWordArray {
    static String maxLength(String[] arr){
        String largest="";
        for (String word:arr){
            if(word.length()>largest.length()){
                largest=word;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
    String a="lili";

}
