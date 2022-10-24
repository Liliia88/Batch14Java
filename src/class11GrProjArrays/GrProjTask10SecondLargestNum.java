package class11GrProjArrays;

public class GrProjTask10SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {234,4565,5768,4792,34,78,1,9,5};
		int largest= numbers[0];
		int largest2=numbers[0];
		
		for (int num:numbers) {
			if (num>largest) {
				largest=num;
			} 
	       } for (int num2:numbers)	{
			  if (num2>largest2 && num2<largest) {
				  largest2=num2;
			  }
		  } System.out.println (largest2);  
	}
}
