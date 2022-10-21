package ReplsAllInteresting;

public class R138Methods {

        private void method1(){
            System.out.println("private");
        }
        void method2(){
            System.out.println("default");
        }
        protected void method3(){
            System.out.println("protected");
        }
        public void method4(){
            System.out.println("public");
        }
    }


    class Main14 {
        public static void main(String[]args){
            new R138Methods().method2();
            new R138Methods().method3();
            new R138Methods().method4();
        }}

