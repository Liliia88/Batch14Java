package class14CreateObjMethodes;

import java.util.Scanner;

public class HW1LargestNum {
    void largest(int num1,int num2){
        if(num1>num2){
            System.out.println("Number 1 is larger "+num1);
        } else if (num2>num1){
            System.out.println("Number 2 is larger "+num2);
        }else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1=scanner.nextInt();
        System.out.println("Please enter the first number");
        int number2=scanner.nextInt();
        HW1LargestNum obj=new HW1LargestNum();
       // obj.largest(5,10);
        obj.largest(number1,number2);
    }
}
