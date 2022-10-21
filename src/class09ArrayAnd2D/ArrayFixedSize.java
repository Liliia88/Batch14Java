package class09ArrayAnd2D;

public class ArrayFixedSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] nums=new int[3];
		
		nums[1]=12;
		nums [2]=13;
		System.out.println(nums[1]);
		
		String [] colors=new String[3];
		colors [0]="White";
		colors [1]="Pink";
		colors [2]="Black";
		colors [3]="Yellow";
		
		System.out.println(colors[2]); //ArrayIndexOutOfBoundsException:3
	}

}
