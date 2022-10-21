package class02;

public class AriphmeticOperationMyOwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=5.0;
		double b=3.0;
		
		double sum=a+b;
		double sub=a-b;
		double div=a/b;
		double multi=a*b;
		
		
		
		System.out.println("The summation of two numbers "+a+" and "+b+" is equal to "+sum+"."); 
		System.out.println("The subtraction of two numbers "+a+" and "+b+" is equal to "+sub+".");
		System.out.println("The division of two numbers "+a+" and "+b+" is equal to "+div+".");
		System.out.println("The multiplication of two numbers "+a+" and "+b+" is equal to "+multi+".");
		
		double c=3.9;
        double square=c*c;
        System.out.println("The square of "+c+" is "+square+".");
        
        int width=5;
        int height=8;
        int perimeter=2*(width+height);
        int area=width*height;
        		
        System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+ area+".");
        
        
        
	}

}
