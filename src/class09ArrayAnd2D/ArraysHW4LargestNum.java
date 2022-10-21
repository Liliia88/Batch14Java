package class09ArrayAnd2D;

public class ArraysHW4LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num2= {1,0,5};
		if (num2[0]>num2[1]&& num2[0]>num2[2]) {
			System.out.println("The largest numbers is "+num2[0]);
		} 
		else if (num2[1]>num2[0]&& num2[1]>num2[2]) {
			System.out.println("The largest numbers is "+num2[1]);
		} else if (num2[2]>num2[0]&& num2[2]>num2[1]){
			System.out.println("The largest numbers is "+num2[2]);
		}
		
		int[] numbers= {34,87,23,6,1,0};
		int largestnumber= numbers [0];
		
		for(int n:numbers) {
			
			if (n>largestnumber) {
				largestnumber=n;
			}
		}
		System.out.println(largestnumber);
	}

}
