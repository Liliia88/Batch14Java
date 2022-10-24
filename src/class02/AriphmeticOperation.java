package class02;

public class AriphmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +, -, *, /, %;

		int a=900;
		int b=100;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		int c=10;
		int d=3;

		int sum=c+d;
		int sub=c-d;
		int remainder=c%d; //10/3

		int div=c/d;

		System.out.println("Sum is = "+sum);
		System.out.println("Sub is = "+sub);
		System.out.println("Remider is = "+remainder);
		System.out.println("Division if integers is= "+div); //3


		System.out.println(20%9);

		double num1=10.0;
		double num2=3.0;
		System.out.println("Division of double = "+num1/num2);
		System.out.println(num1%num2);

		System.out.println(" using float data type -----");

		float number1=10.0F;
		float number2=3.0F;

		System.out.println("Division of float = "+number1/number2);
		System.out.println(number1%number2);

		//remainder - % mod operater
		System.out.println(14%4);

		System.out.println(10+10/10); //11
		System.out.println((10+10)/10); //2


	}

}
