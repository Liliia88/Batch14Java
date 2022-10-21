package class06LogicalOperSwitch;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean boo=!true;
		System.out.println(boo);
		
		boolean rain=true;
		 if(!rain) {
			 System.out.println("I will go for a walk");
		 }
		
		 
		 String day="Monday";
		 
		 if(!day.equals("Tuesday")) {
			 System.out.println("Today is not Sunday");
		 }
		 System.out.println("-----------------------------");

		 
		 boolean checkboxSelected=false;
		 
		 if(!checkboxSelected) {
			 System.out.println("I will click and select it");
		 }
	}

}
