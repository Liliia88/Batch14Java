package ReplsAllInteresting;

public class R131PrintEvery3dLetterStaticM {

        static String thirdLetter (String s){
            String sum="";
            for (char i=0;i<s.length();i+=3) {
                sum+=s.charAt(i);
            }return (sum);
        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(thirdLetter("hello there")); //"hltr"
            System.out.print(thirdLetter("technology")); //"thly"
        }
    }


