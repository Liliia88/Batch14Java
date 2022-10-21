package class07DoWhileForLoop;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Loops - 
 
 */
		int time=10;
		if(time<12) {
			System.out.println("good morning inside if statement");
		}
		/*
		 * infinite loop
		 * while (time<12) {
		 * System.out.println("good morning");	
		}
		 */
		while (time<12) {
			System.out.println("good morning inside while loop");	
			time++; 
		}
	}

}
