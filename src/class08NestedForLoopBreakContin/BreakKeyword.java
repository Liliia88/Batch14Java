package class08NestedForLoopBreakContin;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<15; i++) {
			System.out.println("Hello");
			
			if (i==3) {
			break;
		}
		}
	 //break - the loop and it usually  used inside some type of condition
		System.out.println("End");
		
		boolean hungry=true;
		while (hungry) {
			System.out.println("Give me food");
			break;
		}
		System.out.println("End");
	}

}
