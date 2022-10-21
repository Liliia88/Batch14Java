package ReplsAllInteresting;

public class R82SumNum2Darrays {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int[] b:a){
            for(int numsum:b){
                sum=sum+numsum;
            }}System.out.print(sum);

    }
}
