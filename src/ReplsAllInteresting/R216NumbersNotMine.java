package ReplsAllInteresting;

import java.util.Arrays;

public class R216NumbersNotMine {
    public static int[] ArraySumToZero(int N) {

        int[] num = new int[N];
        if(N>1){
            for(int i=0;i<N;i+=2){

                num[i]=i;
                num[i+1]=i*-1;
            }
            if(N%2!=0){
                num[N-1]=0;
            }
        }
        if(N==1){
            num[0]=0;
        }

        return num;
    }
    public static void main(String[]args){
        System.out.println(Arrays.toString(ArraySumToZero(4)));

    }

}
