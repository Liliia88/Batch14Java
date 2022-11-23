package ReplsAllInteresting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class R212WithoutThrows {
    static void methodCall(){
        try{
            // Scanner input = new Scanner(new File(""));
            FileInputStream fis = new FileInputStream("");
        }catch
        (FileNotFoundException error){
            System.out.println(error);
        }
    }
    public static void main(String[]args){
        methodCall();
    }
}
