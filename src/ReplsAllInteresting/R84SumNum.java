package ReplsAllInteresting;

public class R84SumNum {
    public static void main(String[] args)
    {
        int[][] numbers = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4},
        };
        int sum=0;
        for(int[] num:numbers) {
            for (int n:num){
                if (n%2!=0 && n<0){
                    sum+=1;
                }
            }
        }System.out.print(sum);
    }
}
