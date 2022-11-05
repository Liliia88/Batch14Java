package class23Abstract;

public class ReviewDrinkFinal {
    void drink() {
        System.out.println("drinking method");
    }

    //final methods cannot be overriden
    protected final void enjoy() {
        System.out.println("we enjoy drinking water");
    }
}
// CE: The type Juice cannot subclass the final class Drink

// public class Juice extends ReviewDrinkFinal{

	/* CE: Cannot override the final method from Drink
		public void enjoy() {
			System.out.println("we enjoy drinking juice");
		}
	*/
//}

