package class06LogicalOperSwitch;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from");
		
		String country=in.nextLine();
		String favoriteFood;
		
		switch(country) {
		
		case "USA":
			favoriteFood="burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood="beshbarmak";
			break;
		case "Turkey":
			favoriteFood="adana kebab";
			break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
		case "India":
			favoriteFood="chicken curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		case "Afghanistan":
			favoriteFood="Qaboli Palow";
			break;
		default:
			favoriteFood="Unknown";
		    break;
		
		}
		System.out.println("I'm from "+country+" and my favorite food is "+favoriteFood);
	in.close();
	}

}
