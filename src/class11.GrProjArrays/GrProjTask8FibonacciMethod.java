package class11.GrProjArrays;

public class GrProjTask8FibonacciMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 int limit=10;
		int [] numbers= new int[limit]; 
		 numbers[0]=0;
		 numbers[1]=1;
	   
	   
		for (int i=2;i<limit;i++) {
		numbers[i]=numbers[i-1]+numbers[i-2];	
		}
		System.out.println("Fibonacci series upto "+limit);
			for (int i=0;i<limit;i++) {
				System.out.print(numbers[i]+" ");
			}
		}
	}

