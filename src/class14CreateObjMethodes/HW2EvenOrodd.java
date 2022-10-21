package class14CreateObjMethodes;

import java.util.Scanner;

public class HW2EvenOrodd {
    boolean evenOrodd (int number){
        if(number%2==0){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        HW2EvenOrodd num=new HW2EvenOrodd();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Print any number");
        int number=scanner.nextInt();
        if(num.evenOrodd(number)){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is Odd");
        }

    }
}
