package class09ArrayAnd2D;

public class ArraysHW1Cars2WaysLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]cars= {"Mazda","Toyota","Porche","Tesla","Hyundai","Mersedes"};
		for (int i=0; i<cars.length; i++) {
			  
			  System.out.println(cars[i]);
		}
			  System.out.println("-----------");
			  
			  String[] cars2= {"Mazda","Toyota","Porche","Tesla","Hyundai","Mersedes"};
				for (String cars3:cars2) {
					  
					  System.out.println(cars3);
				}
			  
	}

}
