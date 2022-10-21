package ReplsAllInteresting;

public class R157InsideTheMethodSuper {
        void m1(){
            System.out.println("m1 method in parent class");
        }
    }
    class Child4 extends R157InsideTheMethodSuper{
        void m1(){
            System.out.println("m1 method in child class");
        }
        void m2(){
            m1();
            super.m1();
        }
    }
    class Main16 {
        public static void main (String[]args){
            new Child4().m2();
        }
    }

