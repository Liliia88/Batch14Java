package class09ArrayAnd2D;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// only when we deal with arrays or collections
		//we can use for each loop, enhanced for loop, advanced for loop
		
		String [] iceCream= {"vanilla", "chocolate", "pistashio"};
		
            for(String flavor:iceCream) {
            	
			System.out.println(flavor);
		}
            System.out.println("------------");
          
            char[]letters= {'A','B','C','D'};
            
           for (char letter:letters) {
           System.out.println(letter+" ");
           }System.out.println("------------");
           
           int[]numbers = {12,56,345,1,0,9};
           //get all elements using regular for loop
           
           for(int i=0; i<numbers.length; i++) {
        	   
        	   System.out.print(numbers[i]+" ");
           } System.out.println();
           
           // get all values using enhanced for loop
           //this loop always loops ONLY 1 way: from start till end
           
           for (int num:numbers) {
        	   System.out.print(num+" ");
           }
           //Advanced for loop works only when we work with array or collection ot loop only 1 direction.
	}

}
