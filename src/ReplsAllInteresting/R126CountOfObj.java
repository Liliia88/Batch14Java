package ReplsAllInteresting;

public class R126CountOfObj {
    static int count=0;
    void init()
    {
        count++;
    }
    public static void main(String[]args){
        R126CountOfObj obj=new R126CountOfObj();
        obj.init();
        R126CountOfObj obj2=new R126CountOfObj();
        obj2.init();
        R126CountOfObj obj3=new R126CountOfObj();
        obj3.init();
        System.out.println(R126CountOfObj.count);
    }
}
