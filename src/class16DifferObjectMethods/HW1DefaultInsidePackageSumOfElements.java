package class16DifferObjectMethods;

public class HW1DefaultInsidePackageSumOfElements {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
      int sumOfelements (int [] numbers){
        int sum=0;
        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        } return sum;
    }

    public static void main (String[]args){
        HW1DefaultInsidePackageSumOfElements obj=new HW1DefaultInsidePackageSumOfElements();
        int[] a={5,23,2,9};
        System.out.println(obj.sumOfelements(a));

    }

}
