package ReplsAllInteresting;

public abstract class R171OverloadAbstractM {
    abstract void m1(String a, String b, String c);
    abstract void m1(String word1, String word2, String word3, String word4);
}
class Main26 extends R171OverloadAbstractM{
    @Override
    void m1(String a, String b, String c) {
        System.out.println(a+" "+b+" "+c);
    }

    @Override
    void m1(String word1, String word2, String word3, String word4) {
        System.out.println(word1+" "+word2+" "+word3+" "+word4);
    }
    public static void main(String[]args){
        Main26 p1=new Main26();
        p1.m1("m1","without","parameters");
        p1.m1("m1","method","with","parameter");
    }
}
