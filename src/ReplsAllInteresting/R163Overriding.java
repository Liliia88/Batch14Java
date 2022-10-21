package ReplsAllInteresting;

public class R163Overriding {
    void method(){
        System.out.println("Parent method");
    }
}
class Child6 extends R163Overriding {
    void  method(){
        System.out.println( "Child method");
    }
}
class Main31 {
    public static void main(String[]args){
        new R163Overriding().method();
        new Child6().method();
    }}
