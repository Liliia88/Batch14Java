package class04IfConditScanner;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int time=5;
 String day="Monday";
 
 if(day.equals("Monday")) { // as String is a nonprimitive we can't use == sign
	 // we have to use .equals
	 
	 //it is called outer if - condition if it is true then only 
	 //inner conditions will be checked. if it is false nothing from inner
	 // if - condition will be executed it is like the main door
	 //
	 
		 if(time>7) {
			 
			 System.out.println("Lets go to office");
			 
		 }
		if(time<6) {
			System.out.println("Lets sleep more");
		}
 }	
		
	}

}
