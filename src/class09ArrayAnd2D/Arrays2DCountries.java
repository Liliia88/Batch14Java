package class09ArrayAnd2D;

public class Arrays2DCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]countries= {
				{"Usa","Canada"}, //1 array with index 0
				{"Peru","Brazil", "Colombia", "Ecuador"},
				{"Ethiopia","Egypt","Kenya"},
				{"Germany","Turkie", "Moldova", "Ukraine"},
				{"Kazakhstan","Afghanistan", "Korea"},
		};
		System.out.println(countries.length); //5 - total # of arrays or rows
		
		int elof1ar= countries[0].length;
		System.out.println("# of elements from 1 array = "+elof1ar);
		
		int elof2ar= countries[1].length;
		System.out.println("# of elements from 1 array = "+elof2ar);
		
		
		System.out.println	("---getting all values from 2d array usuing for each loop regular----");
		
		for(int r=0;r<countries.length; r++) { //loops over rows
		   for (int c=0;c<countries[r].length; c++) {
			   System.out.print	(countries[r][c]+" ");
		   } System.out.println ();	
		}
		System.out.println ("------------------------------");	
		
		System.out.println	("---getting all values from 2d array using enhanced for loop syntax ----");
		
		for(String[] country:countries) {
			 for (String c:country) {
				 if (c.equals("Kazakhstan")) {
					 System.out.println (c+" is my home country");	
				 } else {
				 System.out.println (c+" ");	
				 } }  System.out.println ();	
		 }
		
	}

}
