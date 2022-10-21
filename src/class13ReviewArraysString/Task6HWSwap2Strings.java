package class13ReviewArraysString;

public class Task6HWSwap2Strings {
    public static void main(String[] args) {

        String a= "Sweet";
        String b="Home";
        System.out.println("The word a is "+a);
        System.out.println("The word b is "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("The word a is "+a);
        System.out.println("The word b is "+b);

        System.out.println("----------------------");
        String str1="python";
        String str2="Java";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}
