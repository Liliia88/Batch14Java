package class10Objects;

public class Phone2 {

	String model;
	String color;
	int year;
	String price;
	void callfacetime(){

		System.out.println("Calling with facetime from "+model+" with "+color+" color.");
	}
	void chatting() {
		System.out.println("Chatting in Batch14 course with students and teacher "
				+ "from "+model+year+" year.");
	}
	
	public static void main(String[]args) {
		Phone2 iPhone=new Phone2();
		iPhone.model="IPhone 13";
		iPhone.color="white";
		iPhone.year=2022;
		iPhone.price="1.000$";
		iPhone.callfacetime();
		System.out.println(iPhone.model+" is the best one, but wish to get a discount "
				+ "for it's price "+iPhone.price+".");
		
		Phone2 Pixel=new Phone2();
		Pixel.model="Pixel 6a";
		Pixel.color="black";
		Pixel.year=2021;
		Pixel.price="600$";
		Pixel.chatting();
		System.out.println("I have never tried "+Pixel.model+Pixel.color+" color.");
			
		
		Phone2 Samsung=new Phone2();
		Samsung.model="Samsung Galaxy On7";
		Samsung.color="silver";
		Samsung.year=2016;
		Samsung.price="400$";
		Samsung.chatting();
		System.out.println("I lost my "+Samsung.model+" in "+Samsung.year+" , that I "
				+ "bought for "+Samsung.price+".");
		iPhone.callfacetime();
		System.out.println("---------------------");
		  /*
         * if class whos object we are creating
         * is present inside the same package
         * we don't need to import it.
         */
        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.model="Iphone 14 Pro Max";
        iphone.year=2022;
        iphone.storage=128;
        iphone.call();

        //new Phone() => To Create the object
        Phone samsungPhone=new Phone();
        samsungPhone.model="S22 Ultra";
        samsungPhone.make="Samsng";
        samsungPhone.year=2022;
        samsungPhone.call();
	}
}
