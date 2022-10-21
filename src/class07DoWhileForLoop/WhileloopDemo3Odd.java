package class07DoWhileForLoop;

public class WhileloopDemo3Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		while(a>=1) {
			System.out.print(a+" ");
		    a--;	
		}
		System.out.println("------------------------------");
		
        int b=20;
		
		while(b<=100) {
			
			if (b%2==0) {
			System.out.print(b+" ");
			
		}
			b++;
		}
		System.out.println("------------------------------");
		
        int c=100;
		
		while(c>=1) {
			
			if (!(c%2==0)) {
			System.out.print(c+" ");
			
		}
			c--;
		}
		System.out.println("------------------------------");
	}

}
