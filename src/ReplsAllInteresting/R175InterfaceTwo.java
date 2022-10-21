package ReplsAllInteresting;

public interface R175InterfaceTwo {

        void firstMethod();
    }
    interface SecondInterface {
        void secondMethod();
    }
    class Main27  implements R175InterfaceTwo, SecondInterface {
        public void firstMethod(){
            System.out.println("First Method implementing multiple Inheritance");
        }
        public void secondMethod(){
            System.out.println("Second Method implementing multiple Inheritance");
        }
        public static void main (String[]args){
            Main27 main=new Main27();
            main.firstMethod();
            main.secondMethod();
        }
    }


