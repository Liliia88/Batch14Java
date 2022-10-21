package ReplsAllInteresting;

class R150MultilevelInherit {
    String name;
        String lastName;
        int age;
    }
    class Employee extends R150MultilevelInherit {
        int salary2;
        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+salary2);
        }
    }
    class Student extends Employee {
        int grade;
        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+grade);
        }
    }
    class Retiree extends Student{
        String seniorActivity;
        void print(){
            System.out.println(name+" "+lastName+" "+grade+" "+seniorActivity);
        }
    }
    class Main9 {
        public static void main (String[]args){
            Employee e=new Employee();
            e.name="Joe";
            e.lastName="Smith";
            e.age=35;
            e.salary2=35000;
            e.print();
            Student s=new Student();
            s.name="Adam";
            s.lastName="Smith";
            s.age=15;
            s.grade=10;
            s.print();
            Retiree r=new Retiree();
            r.name="Frank";
            r.lastName="Smith";
            r.grade=15;
            r.seniorActivity="tour";
            r.print();
        }
    }
