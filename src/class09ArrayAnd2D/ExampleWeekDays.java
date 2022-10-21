package class09ArrayAnd2D;

public class ExampleWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] week= {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		// if day is Sunday -> it is Funday
		//otherwise - it is a boring day
		for (String day:week) {
			if (day.equals("Sunday")) {
				System.out.println(day+" is a Fun day");
			} else {
				System.out.println(day+" is a boring day");
			}
			
		}
	}

}
