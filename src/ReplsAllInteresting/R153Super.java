package ReplsAllInteresting;

public class R153Super {
    R153Super (){
            System.out.println("This is Parent constructor");
        }
    }
class Child2 extends R153Super{

    Child2(){
        super();
    }
}
class Main12 {
    public static void main (String[]args){
        new Child2();
    }
}



