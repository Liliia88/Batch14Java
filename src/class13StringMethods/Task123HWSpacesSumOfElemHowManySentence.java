package class13StringMethods;

public class Task123HWSpacesSumOfElemHowManySentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love a weekend";
		System.out.println(str.replaceAll(" ",""));
		
		System.out.println("----------------");
		
		String str2="sdfjkdjfAIEOWI39489!$#@@^&";
		str2=str2.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str2.length());
		
		System.out.println("----------------");
		
		String str3="sdfjkdjfAIEOWI39489";
		int sum=0;
		for(int i=0;i<str3.length();i++) {
			sum+=1;
		} System.out.println(sum);
		System.out.println("----------------");

		String str4 = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] words=str4.split("[?]");
		System.out.println(words.length);

	}

}
