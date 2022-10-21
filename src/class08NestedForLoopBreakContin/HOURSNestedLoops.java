package class08NestedForLoopBreakContin;

public class HOURSNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		for (int htens=0; htens<=2; htens++) {
			for (int hones=0; hones<=9; hones++) {
				if ( htens>=2 && hones>=4) {
					continue;
					} 	
				for (int mtens=0; mtens<=5; mtens++) {
					for (int mones=0; mones<=9; mones++) {
						
						for (int stens=0; stens<=5; stens++) {
							for (int sones=0; sones<=9; sones++) {
								
					System.out.println(" "+htens+hones+" : "+mtens+mones+" : "+stens+sones);
				}
				}
			}
		}
				}		
		}
}
}