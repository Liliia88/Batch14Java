package class30Exception;

public class Review2CreateExcept {
    public static void main(String[] args) throws AgeNotAllowed {
        int age=15;

        if(age<18){
            throw new AgeNotAllowed("You should not be here");
        }
    }
}
class AgeNotAllowed extends Exception{
    AgeNotAllowed(String Mihan){
        super(Mihan);
    }
}


