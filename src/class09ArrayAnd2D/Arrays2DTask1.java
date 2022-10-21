package class09ArrayAnd2D;

public class Arrays2DTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] names= {
				{"Mr", "Mrs", "Ms"},
				{"Miss","Smith", "Jordan"},
				{ "Jackson", "Obama"},
		};
		System.out.println(names[0][1] +" "+ names [1][1]);
		System.out.println(names[0][0] +" "+ names [2][1]);
		System.out.println(names[0][2] +" "+ names [2][0]);
		System.out.println(names[1][0] +" "+ names [1][2]);
		
		System.out.println("--------------------------------");
		
		String[][] bigArray= new String [2][4];
		//1row
		bigArray [0][0]="Mr";
		bigArray [0][1]="Mrs";
		bigArray [0][2]="Ms";
		bigArray [0][3]="Miss";
		//2row
		
		bigArray [1][0]="Jordan";
		bigArray [1][1]="Jackson";
		bigArray [1][2]="Obama";
		bigArray [1][3]="Smith";
		
				// how to access elements from 2d array?
				System.out.println(bigArray[0][1]+" "+ bigArray [1][3]);
				System.out.println(bigArray[0][0]+" "+bigArray [1][2]); 
				System.out.println(bigArray[0][2]+" "+bigArray [1][1]);
				System.out.println(bigArray[0][3]+" "+bigArray [1][0]); 
				
				
				
		}
	}


