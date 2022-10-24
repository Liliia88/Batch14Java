package class11GrProjArrays;

public class GrProjTask9LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {345,123,78,6789,9,1,2,34};
		int largest= numbers [0];
		for (int finalnum:numbers) {
			if(finalnum>largest) {
				largest=finalnum;
			}
		} System.out.println("The largest number is "+ largest);
		System.out.println("-----------------------");
		
		int smallest= numbers [0];
		for (int number:numbers) {
			if (number<smallest) {
				smallest=number;
			}
		} System.out.println("The smallest number is "+smallest);
	 System.out.println ("------------------------------");
	}
}
