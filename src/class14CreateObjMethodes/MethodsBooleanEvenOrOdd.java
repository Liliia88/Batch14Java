package class14CreateObjMethodes;

import java.util.Scanner;

public class MethodsBooleanEvenOrOdd {
    boolean isEven(int number){
        if(number%2==0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        MethodsBooleanEvenOrOdd md=new MethodsBooleanEvenOrOdd();
        if(md.isEven(4)){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is Odd");
        }
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
    }
}
