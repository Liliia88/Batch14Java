package class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* type casting=> data  type casting = converting 
		 * converting one data type to another
		 * 
		 */
		
		 byte box1=127; //smallest box;
		 short box2=3333; // slightly large box 
		 char a='A';
		 int box3=45434545; //large box most commonly used;
		 long box4=45454545; //slightly large box;
		 float box5=34567876; //larger box;
		 double box6=45454595; //largest;
		 
		 
		 int number= (int)15.2; // we can't store the decimal number in a box of type int 
		 System.out.println(number);
		
		 byte smallerBox=(byte)box2;
		 System.out.println(smallerBox);
		
		 short biggerBox=box1;
		 
		 long box7=box1; //we can do this because box 7 is larger than box1
		 float box8=(float)box6; //as box6 is larger it is double we need type casting to assign the value
		 
		 char b=(char)67;
		 System.out.println(a);
		 
		 int box9=(int)box4;
		 System.out.println(box9);
		 
		 // explicit/narrowing/manual
		 //as we can't fit 129 in byte we will get wrong results
		 short largerbox1=129;
		 byte smallerbox1=(byte)largerbox1;
		 System.out.println(smallerbox1);
		 
		 //explicit/narrowing/manual
		 //as we can fit 129 in short we will get proper results
		 int largerBox2=129;
		 short smallerBox2=(short)largerBox2;
		 System.out.println(smallerBox2);
		 
	}

}
