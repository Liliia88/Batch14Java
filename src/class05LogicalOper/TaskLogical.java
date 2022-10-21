package class05LogicalOper;

import java.util.Scanner;

public class TaskLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner scanner=new Scanner(System.in);
		//int h1=60;
		//int h2=72;
		//int h3=
     System.out.println("Please enter the height in inche");
     
		int h = scanner.nextInt();
		
		if(h>10 && h<60 ) {
			 System.out.println("short");	 
		} else if(h>60 && h<70)
		{
			System.out.println("medium");
		} else if (h>=70)
		{
			System.out.println("tall");
		}
		
		
		
	}

}
