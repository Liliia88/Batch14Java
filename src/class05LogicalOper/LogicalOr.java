package class05LogicalOper;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="saturday";
		
		if(day.equals("saturday")|| day.equals("sunday")) {
			
			System.out.println("I have Java class at Syntax - using logical OR");
		}
		
        if(day.equals("saturday") && day.equals("sunday")) {
			
			System.out.println("I have Java class at Syntax");
		
        }
        
        double salary = 80000;
        String title="Automation Tester";
        
        if(title.equals("Automation Tester") || salary == 120000) {
        	System.out.println("Happy");
        }
	}

}
