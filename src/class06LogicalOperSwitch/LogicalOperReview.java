package class06LogicalOperSwitch;

public class LogicalOperReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double savings=200000;
		boolean freetime=true;
		String season="Summer";
		
		if(savings>100000 && freetime && season.equals("Summer")) {
			System.out.println("Let's go to Bora Bora");
		} else {
			System.out.println("I need time and money");
		}
	}

}
