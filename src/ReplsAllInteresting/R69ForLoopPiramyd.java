package ReplsAllInteresting;

public class R69ForLoopPiramyd {
    public static void main (String[]args){

        for (int a=0; a<13; a++) {
            if (a>=7){
                for (int d=1; d<=a-5; d++){
                    System.out.print(d+" ");
                }
            }
            for (int b=1; b<=7-a; b++){
                System.out.print(b+" ");
            }System.out.println();

        }
    }
}
