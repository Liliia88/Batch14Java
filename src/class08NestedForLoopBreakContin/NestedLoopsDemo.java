package class08NestedForLoopBreakContin;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<3; i++) {// --> outer loop
			System.out.println("Hello");

			for (int j=1; j<=3; j++) {// --> nested loop
			System.out.println("Bye");
			}
		}
		System.out.println("End of the code");
		System.out.println("------------------");
		
		for (int i=0; i<=2; i++) {
			for (int j=1; j<4; j++) {
		
			System.out.println(i+" "+j);
		}
		}	
	}

}
