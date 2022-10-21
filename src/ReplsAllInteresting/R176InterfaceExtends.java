package ReplsAllInteresting;

public interface R176InterfaceExtends {
        void parentMethod();
    }
    interface ChildInterface extends R176InterfaceExtends{
        void childMethod ();
    }

    class Main28 implements ChildInterface{
        public void parentMethod(){
            System.out.println("Parent Method-welcome to Syntax");
        }
        public void childMethod (){
            System.out.println("Child Method-hello Syntax");
        }
        public static void main(String[]args){
            Main28 main=new Main28();
            main.parentMethod();
            main.childMethod();
        }
    }

