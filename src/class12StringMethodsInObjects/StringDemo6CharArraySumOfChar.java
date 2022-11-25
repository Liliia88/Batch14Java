package class12StringMethodsInObjects;

import java.util.Arrays;

public class StringDemo6CharArraySumOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="I love java programming";
	        /*
	         * toCharArray will convert a String to an array of chars
	         */
	        char[] charArray=str.toCharArray();

	        System.out.println(Arrays.toString(charArray));
	        System.out.println(charArray);
	        System.out.println(charArray[7]);

	        int counter=0;
	        for(char c:charArray) {

	            if(c=='a') {
	                counter++;
	            }
	        }
	        System.out.println("letter a has appread "+counter+" times");

	}

}
