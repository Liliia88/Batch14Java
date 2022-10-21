package ReplsAllInteresting;

public class R83SUMEveryRowArraysd2d {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        //int sum2=0;
        //  int sum3=0;
        for (int [] numbers:a){
            int sum1=0;
            for(int num:numbers){
                sum1=(sum1+num);
            } System.out.println(sum1);
        }
    }
}
