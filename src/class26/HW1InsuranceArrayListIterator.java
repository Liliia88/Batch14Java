package class26;
import java.util.ArrayList;
import java.util.Iterator;
public abstract class HW1InsuranceArrayListIterator {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and
    cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
    has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;
    HW1InsuranceArrayListIterator(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();

    @Override
    public String toString() {
        return "HW1InsuranceArrayListIterator{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Car extends HW1InsuranceArrayListIterator {
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
    void getQuote() {
        System.out.println(carModel + " is covered with " + insuranceName + "  with a wide quote for first 10 years");
    }
    void cancelInsurance() {
        System.out.println("In accordance with rule of " + insuranceName + " If " + carModel + "has been damaged in a 10 years, it will not be covered with insurance");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Pet extends HW1InsuranceArrayListIterator {
    String petType;
    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    void getQuote() {
        System.out.println(petType + " has a " + petType + " insurance quote ");
    }
    void cancelInsurance() {
        System.out.println("In accordance with rulle of " + insuranceName + " if " + petType + " has got problem with teeth, it is no covered with insurance");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends HW1InsuranceArrayListIterator {
    Health(String insuranceName) {
        super(insuranceName);
    }
    void getQuote() {
        System.out.println(insuranceName + " get quote ");
    }
    void cancelInsurance() {
        System.out.println(insuranceName + " will never be canceled ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class testerTest7 {
    public static void main(String[] args) {
            /*HW1InsuranceArrayListIterator car = new Car("Car Insurance","Mercedes");
            HW1InsuranceArrayListIterator pet = new Pet("Pet Insurance","Cat");
            HW1InsuranceArrayListIterator health = new Health("Health Insurance");
*/
        ArrayList<HW1InsuranceArrayListIterator> arrayList = new ArrayList<>();
        arrayList.add(new Car("Car Insurance", "Mercedes"));
        arrayList.add(new Pet("Pet Insurance", "Cat"));
        arrayList.add(new Health("Health Insurance"));

        System.out.println(arrayList);

        Iterator<HW1InsuranceArrayListIterator> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            HW1InsuranceArrayListIterator item = iterator.next();
            item.getQuote();
            item.cancelInsurance();
        }
        //-------------------------------------------------------
        for (HW1InsuranceArrayListIterator list : arrayList) {
            list.getQuote();
            list.cancelInsurance();
        }
        //---------------------------------
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
