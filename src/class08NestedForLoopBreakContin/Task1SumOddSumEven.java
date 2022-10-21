package class08NestedForLoopBreakContin;

public class Task1SumOddSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumodd=0;
		int sumeven =0;
		for (int a=1; a<50; a++) {
			if (!(a%2==0)) {
		 sumeven+=a;
		} else {
			sumodd+=a;
		}
		}
			System.out.println("sum of even num is "+sumeven);
			System.out.println("sum of odd num is "+sumodd);
		}
	}


