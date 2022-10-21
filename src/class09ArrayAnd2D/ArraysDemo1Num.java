package class09ArrayAnd2D;

public class ArraysDemo1Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[4];
		//store elements inside an array
		arr [0]=10;
		arr [1]=20;
		arr [2]=30;
		arr [3]=40;
		
		//accesing elements from the array
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[2]);
		
		//Let's vreate an array and store your classmates
		String[] names=new String[5];
		names[0]="Shah";
		names[1]="Vera";
		names[2]="Roman";
		names[3]="Vera";
		names[4]="Zamanhullah";
		System.out.println("Hello "+names[1]);
	}

}
