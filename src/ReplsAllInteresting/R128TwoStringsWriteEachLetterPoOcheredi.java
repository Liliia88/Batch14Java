package ReplsAllInteresting;

public class R128TwoStringsWriteEachLetterPoOcheredi {
    static String mixString (String s1, String s2){
        String sum="";

        for(int j=0;j<s2.length();j++){
            sum+=(s1.charAt(j));
            sum+=(s2.charAt(j));
        }  return (sum);
    }
    //test case below (dont change):
    public static void main(String[] args){

        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}
