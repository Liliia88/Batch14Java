package class09ArrayAnd2D;

public class ArrayIntHW3SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num=new int[4];
		
		num [0]=6;
		num [1]=80;
		num [2]=34;
		num [3]=2;
		
		System.out.println(num[0]+num[1]+num[2]+num[3]);
		System.out.println("-------------------");
		
		
		int[] num2= {3,2,1,5,0};
		int sum=0;
		for (int i=0; i<num2.length; i++) {
		sum+=num2[i];	
			}System.out.println(sum);
		}
		
	}	

