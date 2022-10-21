package class12StringMethods.StringMethodsInObjects;

import java.util.Scanner;

public class HWTask3BabyNameDaddyMomSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("What is Dad's name?");
       String daddyname=scanner.next();
       System.out.println("What is Mom's name?");
       String momsname=scanner.next();
       System.out.println("What is gender of baby?");
       String gen=scanner.next();
		String name=null;
		
        if (gen.equals("boy")) {
        	name = daddyname.substring(0,daddyname.length()/2)+momsname.substring(momsname.length()/2);
			
        } else if (gen.equals("girl")) {
        	name = momsname.substring(0,momsname.length()/2)+daddyname.substring(daddyname.length()/2);
        }
	
		 System.out.println(name.toUpperCase());
		
	}

}
