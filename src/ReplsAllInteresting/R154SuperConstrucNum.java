package ReplsAllInteresting;

class R154Super {

    R154Super(){
            System.out.println("Parent Constructor without argument");
        }

        int number;
    R154Super(int number){
            this.number=number;
            System.out.println(number);
        }
    }
    class Child3 extends R154Super{
        Child3(){
            System.out.println("Child Constructor without argument");
        }
        Child3(int number){
            super(number);
        }
    }
    class Main13 {
        public static void main (String[]args){
            Child3 c=new Child3();
            Child3 c2=new Child3(10);
        }
    }

