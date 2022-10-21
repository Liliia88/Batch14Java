package class06LogicalOperSwitch;

import java.util.Scanner;

public class HomWork3Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter first number");
		double num1=scanner.nextDouble();
		System.out.println("Please enter second number");
		double num2=scanner.nextDouble();
		System.out.println("Please choose the operator");
		char operate=scanner.next().charAt(0);
		double result=0;
		boolean wrongresult=false;
		
        switch (operate) {
		
		case '-':
			result=(num1-num2);
		    break;
		case '+':
			result=(num1+num2);
			break;
		case '/':
			result=(num1/num2);
			break;
		case '*':
			result=(num1*num2);
			break;
		default:
			System.out.println("The result is not valid");
			wrongresult=true;
			break;
			
		}
        if (wrongresult==false) {
		System.out.println("If you choose "+operate+" your result will be "+result);
        }
		
		System.out.println("------------------------------------------------------");
		if (operate=='-') {
			result=(num1-num2);
		
		} else if (operate=='+') {
			result=(num1+num2);
		
		} else if (operate=='*') {
			result=(num1*num2);
			
		} else if (operate=='/') {
			result=(num1/num2);
			
		} else {
			System.out.println("The result is indefinite");
			wrongresult=true;
		}
		if (wrongresult==false) {
		System.out.println("The result will be "+result);
		scanner.close();
		}
		}
	}


