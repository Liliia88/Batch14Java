package ReplsAllInteresting;

public class R117SumOfEvenNumInNum {
    void sumEven(int number){
        int sum=0;
        for (int i=0;i<=number;i++){
            if (i%2==0){
                sum+=i;
            }
        } System.out.println(sum);
    }
    public static void main (String[]args){
        R117SumOfEvenNumInNum obj=new R117SumOfEvenNumInNum();
        obj.sumEven(5);
        obj.sumEven(8);
    }
}
