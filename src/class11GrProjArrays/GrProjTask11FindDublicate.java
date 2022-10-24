package class11GrProjArrays;

public class GrProjTask11FindDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] elements= {"watermelon", "strawberry","potato","strawberry","potato","watermelon"};
		
		
		for(int a=0;a<elements.length; a++) { //loops over rows
			   for (int b=0;b<elements.length; b++) {
				  if(a==b) {
				  continue;}
	    	if (elements[a].equals(elements[b])) {
	    		 
	    		 System.out.println	("The dublicate element is "+elements[a]);
	    	 
	    	} 
	    
	}
	}
		 System.out.println	("-------------------------------");
		   for (int x = 0; x < elements.length; x++) {
	            for (int y = x+1; y < elements.length; y++) {
	                if (elements[x].equals(elements[y])) {
	                    System.out.println("Duplicate element is - " + elements[x]);
	                }

	            }
	        }
		}		
		
		}		
