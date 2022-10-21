package class06LogicalOperSwitch;

public class RlOG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result=0;
		double num1=30;
		double num2=56;
		
		char sign='-';
		switch(sign) {
		
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
		break;
	}
	System.out.println("If you choose "+sign+" your result will be "+result);
	}

}
