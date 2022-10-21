package class13ReviewArraysString;

import java.util.Arrays;

public class Task3HWReverseStringWordByWord {
    public static void main(String[] args) {
        String sentence="I love Java Programming";

        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(int j=0;j<words.length;j++) {
            StringBuilder newwords=new StringBuilder(words[j]);
            System.out.print(newwords.reverse()+" ");
        }   System.out.println("------------");

        for (int i=0;i<words.length;i++){
            for (int c=words[i].length()-1;c>=0;c--){
                System.out.print(words[i].charAt(c));
            }System.out.print(" ");
        }
        }
    }

