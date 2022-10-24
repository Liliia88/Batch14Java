package class11GrProjArrays;

public class GrProjTask5SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers= {{45,7,22,66,},
				           {99,100,4,3},
			               {34,38,7,3}
	                 	};
	   int sumEven=0;
	   int sumOdd=0;
	  // int sum=sumEven+sumEven;
	   for(int[] num:numbers) {
		   for (int n:num) {
			   if (n%2==0) {
				   sumEven+=n;
			   } else if (!(n%2==0)) {
				   sumOdd+=n;
			   }
		   }
	   } System.out.println("The sum of even numbers is "+sumEven);
	     System.out.println("The sum of odd numbers is "+sumOdd);
	//     System.out.println("The sum of odd numbers is "+sum);
	}

}
