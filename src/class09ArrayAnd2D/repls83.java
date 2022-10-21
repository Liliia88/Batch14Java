package class09ArrayAnd2D;

public class repls83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
		             {1,1,2}, //sum = 4
	          	    {3,1,2}, //sum = 6
        		    {3,5,3}, //sum = 11
		            {0,1,2}  //sum = 3
                 	};


for (int [] numbers:a){
//int sum1=0;
//int sum2=0+sum1;
int sum2=0;	
//int sum3=0+sum2;
for(int num:numbers){
	sum2=+num;
 
// sum1=(sum1+num)-sum2;
} System.out.println(sum2);

}

	}

}
