package ReplsAllInteresting;

public class R169ArrayAverageFinalMethod {
    final static double avgElements(int[] number){
        double sum=0;
        for (int num:number){
            sum=sum+num;
        } return (sum/5);
    }


    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}

