package ReplsAllInteresting;

public class R125StaticAndNonStaticCallWayofValue {
    static int number=200;
    int number(int n){
        return n;
    }

    public static void main(String[]args){
        System.out.println(R125StaticAndNonStaticCallWayofValue.number);

        R125StaticAndNonStaticCallWayofValue obj=new R125StaticAndNonStaticCallWayofValue();
        System.out.println(obj.number(200));

    }
}
