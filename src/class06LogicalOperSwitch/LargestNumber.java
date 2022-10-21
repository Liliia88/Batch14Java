package class06LogicalOperSwitch;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the largest number 
		//then find if the largest number is even or odd?
		
		int  n1=100;
		 int n2=2000;
		 int n3=30000;
		 int largest=0;
		 
		 if(n1>n2 && n1>n3) {
	
			 largest=n1;
			 
		 } else if (n2>n3 && n2>n1) {
			 
			 largest=2;
			 
		 } else if (n3>n1 && n3>n2) {
			
			 largest=n3;
		 }
		 
		 

		 if (largest!=0){
		 
		 if(largest%2==0) {
			 System.out.println(largest+" is even number");	 
		 } else {
			 System.out.println(largest+" is odd number"); 
		 }
		 
		 }
	}

}
