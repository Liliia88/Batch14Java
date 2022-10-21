package ReplsAllInteresting;

public class R156SuperMethod {

        int i=10;
    }
    class B extends R156SuperMethod {
        int i=20;
        void display(){
            System.out.println(i);
            System.out.println(super.i);
        }
    }
    class Main15 {
        public static void main(String[]args){
            new B().display();
        }
    }

