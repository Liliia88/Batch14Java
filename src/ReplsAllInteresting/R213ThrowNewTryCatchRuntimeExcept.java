package ReplsAllInteresting;

public class R213ThrowNewTryCatchRuntimeExcept {

    static void checkweather(int temp) throws RuntimeException{
        if (temp<32){
            throw new RuntimeException("It is freezing");
        }
    }



    public static void main (String[]args){
        try{
            R213ThrowNewTryCatchRuntimeExcept.checkweather(31);
        }catch(RuntimeException error)
        {
            System.out.println(error);
        }

    }
}


