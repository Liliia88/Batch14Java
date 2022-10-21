package class07DoWhileForLoop;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		while(a>=1) {
			System.out.print(a+" ");
		    a-=2;	
		}
		
		System.out.println("------------------------------");
		
		int b=20;
		
		while(b>=1) {
			
			if (b%2==0) {
			System.out.print(b+" ");
			
		}
			b--;
		}

		System.out.println("------------------------------");
		
		for (int i=20; i>1; i--) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("------------------------------");
		for (int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println("--------------------");
		
	}

}
