package class14CreateObjMethodes;

public class MethodsDemo4StringBoolean {
    boolean mystery() {

        return false;
    }
    String mystery2(int num){

        return "Java";
    }
    String method(String word){
       if(word.equals("Java")) {
           return "python";
       }else{
           return "Java";
       }
       }

    public static void main(String[] args) {
        MethodsDemo4StringBoolean methodsDemo4=new MethodsDemo4StringBoolean();
        System.out.println(methodsDemo4.mystery());
        System.out.println(methodsDemo4.mystery2(5));
        System.out.println(methodsDemo4.method("python"));
    }
}
