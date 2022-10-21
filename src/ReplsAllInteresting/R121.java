package ReplsAllInteresting;

public class R121 {
    int number;
    double num;
    char sign;

    void result(){
        System.out.println(number);
        System.out.println(num);
        System.out.println(sign);
    }

    public static void main(String[]args){
        R121 obj=new R121();
        obj.number=10;
        obj.num=10.23;
        obj.sign='a';
        obj.result();
        R121 obj2=new R121();
        obj2.number=100;
        obj2.num=100.23;
        obj2.sign='s';
        obj2.result();
    }
}
