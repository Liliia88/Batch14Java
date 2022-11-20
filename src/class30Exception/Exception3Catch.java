package class30Exception;

public class Exception3Catch {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());
        } catch (Exception anibar){
            System.out.println("Send an email ");
        }
        System.out.println("some important message 1");
    }
}
