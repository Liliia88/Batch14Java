package class09ArrayAnd2D;

public class Arrays2DSecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] names= {
				{"Liliia", "Bob", "Martin", "Renat"},
				{"A", "B", "C","D"},
		};
		System.out.println(names[0][0] +"="+ names [1][1]);
		System.out.println(names[0][1] +"="+ names [1][2]);
		System.out.println(names[0][2] +"="+ names [1][3]);
		System.out.println(names[0][3] +"="+ names [1][2]);
		
		System.out.println("----------------------------------------");
       for (int i=0; i<names.length;i++) {
    	   for(int j=0; j<names[i].length;j++) {
    		   System.out.println(names[i][j]+" ");
    	   } 
       }   
       System.out.println("----------------------------------------");
       
       for(String[] singleArray:names) { //loops over 1d or single array
    	   for(String el:singleArray) { //loop over each element
    		   System.out.println(el);
    	   }
       }
	}

}
