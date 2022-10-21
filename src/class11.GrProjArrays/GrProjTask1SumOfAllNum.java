package class11.GrProjArrays;

import java.util.Scanner;

public class GrProjTask1SumOfAllNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Using Scanner create an array of integer values. After
the array is created, calculate the sum of all stored
elements in that array.
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
       
		System.out.println("Print enter the size of the array");
         int size=scanner.nextInt();
		 int[]numbers=new int[size];
		
		int sum=0;
        for(int i=0;i<size;i++) {	
        System.out.println("Print enter numbers");
    	   numbers[i]=scanner.nextInt();
    	   sum+=numbers[i];
        }  
        System.out.println("Sum of all numbers is "+sum);
        scanner.close();
       }
	}


