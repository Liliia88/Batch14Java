package class12StringMethodsInObjects;

public class HWTask1MiddleLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="weekend";

		if (!word.isEmpty()) {
			if (word.length()%2!=0 && word.length()>=3) {
				System.out.println(word.charAt((word.length()-1)/2));
			}

		}

		//char[] charArr=word.toCharArray();
		//for(int i=charArr.length-1;i>=0;i--) {
		//	System.out.print(word);
		//}
	}

}
