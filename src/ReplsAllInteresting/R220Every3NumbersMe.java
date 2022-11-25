package ReplsAllInteresting;
public class R220Every3NumbersMe {
    public static void main(String[] args) {
        System.out.println(formatString("00-44 #$% 48 55"));
    }
    public static String formatString(String S){
        String name="";
        String numbers = S.replaceAll("[^a-zA-Z0-9]","");

        for (int i=0;i<=numbers.length();i+=3){
            name += numbers.substring(0,3)+"-";
            numbers=numbers.substring(3,numbers.length());
            if(numbers.length()<4){
                name+=numbers;
            }
        }
        return name.trim();
    }
}
