package ReplsAllInteresting;

public class R130StaticMArrayMultipl {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50

    }
    static void mystery(int[] array)	{
        for(int a:array){
            int sum=0;
            if (a%2!=0){
                sum+=a*10;
            }
            else if
            (a%2==0){
                sum+=a/2;
            }System.out.print(sum+" ");
        }
    }
}
