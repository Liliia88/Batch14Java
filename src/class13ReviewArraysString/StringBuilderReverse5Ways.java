package class13ReviewArraysString;
public class StringBuilderReverse5Ways {
    public static void main(String[] args) {
        String str = "hello";
        //1
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        } System.out.println(newString);
        //2
        StringBuilder word = new StringBuilder(str);
        System.out.println(word.reverse());
        //3
        String[] letters=str.split("");
            for (int c=letters.length-1;c>=0;c--){
                System.out.print(letters[c]);
            } System.out.println("------------------");
        //4
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }System.out.println("------------------");
        //5
        char[] a=str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
            }
        }
