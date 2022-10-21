package class14CreateObjMethodes;
public class HW6PrimeOrNotBooleanMethod {
    boolean primeOrnot(int number){
        boolean isPrime=true;
        if (number > 1) {
        for(int i=2;i<number;i++) {
            if(number%i==0) {
              isPrime = false;
              break;
        } }
        }else {
            isPrime=false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        HW6PrimeOrNotBooleanMethod obj=new HW6PrimeOrNotBooleanMethod();
        System.out.println(obj.primeOrnot(7));
    }
}
