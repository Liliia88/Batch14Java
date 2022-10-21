package ReplsAllInteresting;

public class R134CountOfVowelsStaticM {
        static int countVowels (String s)	{
            int count=0;
            s=s.toLowerCase();
            char[] charArray=s.toCharArray();
            for (char c:charArray) {
                if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                    count++;
                }
            }return (count);
        }
        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(countVowels("obama")); //3
            System.out.println(countVowels("happy friday! i love weekends")); //9
        }
    }
