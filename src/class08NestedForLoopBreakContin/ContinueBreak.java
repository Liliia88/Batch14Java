package class08NestedForLoopBreakContin;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<5; i++) {
			
			if (i==3) {
			continue;
	}
			System.out.println(i);
		}
		
		//I want to print num from 1 to 20 escept num 6,7 and 8;
		
		for (int i=1; i<20; i++) {
			 
			 if (i==6|| i==7 || i==8) {
				 continue;
			 }
			 System.out.print(i+" ");
		 }
}
}
