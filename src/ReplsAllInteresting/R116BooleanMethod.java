package ReplsAllInteresting;

public class R116BooleanMethod{
        boolean R116BooleanMethod(int number1, int number2){
            boolean iseven=true;
            if (number1%2==0 && number2%2==0){
                return iseven;
            } else {
                return (!iseven);
            }
        }
        public static void main (String[]args){
            R116BooleanMethod obj=new R116BooleanMethod();
            System.out.println(obj.R116BooleanMethod(4,6));
            System.out.println(obj.R116BooleanMethod(3,4));
            System.out.println(obj.R116BooleanMethod(-1,1));
        }
}
