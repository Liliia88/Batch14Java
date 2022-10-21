package ReplsAllInteresting;

public class R118SpaceAmongLetters {

        void result (String word){
            String space=" ";
            for (int i=0;i<word.length();i++){
                System.out.print(word.charAt(i)+space);
            }
        }
        public static void main (String[]args){
            R118SpaceAmongLetters obj=new R118SpaceAmongLetters();
            obj.result("hello");
        }
    }

