package class20MethodOverloading;

public class HW4 {
    /*Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/
    private void print(String a){
        System.out.println(a);
    }
    private void print(String a, String b){
        System.out.println(a+" "+b);
    }
    private void print(char c){
        System.out.println(c);
    }
    public static void main(String[]args){
        new HW4().print("peace");
        new HW4().print("love","buble gum");
        new HW4().print('!');
    }
}
