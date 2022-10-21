package class11.GrProjArrays;

public class GrProjTask4EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers= {{34,678,37,1,45},
				           {9,55,78,345,21,},
				           {66,99,88,44,33},
		};
		System.out.print("Even numbers are ");
		
		for (int[] num:numbers) {
			for (int n:num) {
				if (n%2==0) {
					System.out.print(n+" ");
				    
				 } 
			}
		}
		
	}

}
