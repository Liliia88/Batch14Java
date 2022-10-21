package class06LogicalOperSwitch;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from");
		
		String country=in.nextLine();
		String language;
		
		switch(country.toLowerCase()) {
		
		case "russia":
			language="Russian";
			break;
		case "usa":
			language="English";
			break;
		case "turkey":
			language="Turkish";
			break;
		case "spain":
			language="Spanish";
			break;
		case "brazilia":
			language="Portuguese";
			break;
		default:
			language="Unknown";
		    break;
		}
		System.out.println("I'm from "+country+" and I speak "+language);
		in.close();
		
	}

}
