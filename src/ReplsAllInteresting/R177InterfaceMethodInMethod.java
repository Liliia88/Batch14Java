package ReplsAllInteresting;

public interface R177InterfaceMethodInMethod {
        void display(String result);
    }
    interface Functions extends R177InterfaceMethodInMethod {

        double adding(double firstnumber, double secondNumber);
        double subtracting(double firstnumber, double secondNumber);
        double multiply(double firstnumber, double secondNumber);
        double dividing(double firstnumber, double secondNumber);
    }
    class Main29 implements Functions{
        public void display (String result){
            System.out.println("Result is ::: "+result);
        }
        public double adding(double firstnumber, double secondNumber){
            return(firstnumber+secondNumber);
        }
        public double subtracting(double firstnumber, double secondNumber){
            return(firstnumber-secondNumber);
        }
        public double multiply(double firstnumber, double secondNumber){
            return(firstnumber*secondNumber);
        }
        public double dividing(double firstnumber, double secondNumber){
            return(firstnumber/secondNumber);
        }
        public static void main(String[]args){
            double firstNumber=100.00;
            double secondNumber=20.00;

            Main29 main=new Main29();

            main.display(String.valueOf(main.adding(firstNumber,secondNumber)));
            main.display(String.valueOf(main.subtracting(firstNumber,secondNumber)));
            main.display(String.valueOf(main.multiply(firstNumber,secondNumber)));
            main.display(String.valueOf(main.dividing(firstNumber,secondNumber)));

        }
    }

