package class11GrProjArrays;

public class GrProjTask3SumOfallnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[][] numbers= {{323,67,45,89,12},
		          {8,0,3,2,15},
                  {9,6,23,82,11},
                 };
  int  sum=0;
  
  for(int[] num:numbers) {
	  for (int n:num) {
	  sum+=n;
	  }
  }System.out.println(sum);
	}

}
