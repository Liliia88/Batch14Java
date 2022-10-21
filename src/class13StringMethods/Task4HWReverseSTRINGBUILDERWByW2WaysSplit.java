package class13StringMethods;

public class Task4HWReverseSTRINGBUILDERWByW2WaysSplit {
    public static void main(String[] args) {
        String sentence="I love Java Programming";

        String[] words={"I","love","Java", "Programming"};//sentence.split(" ");


        for(int j=0;j<words.length;j++) {
            String w=words[j];
            StringBuilder newwords=new StringBuilder(w);
            System.out.print(newwords.reverse()+" ");
        }

        System.out.println("------------");

        for (int i=0;i<words.length;i++){
            for (int c=words[i].length()-1;c>=0;c--){
                System.out.print(words[i].charAt(c));
            }

            System.out.print(" ");
        }
        }
    }

