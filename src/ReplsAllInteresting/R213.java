package ReplsAllInteresting;

public class R213 {

    static void checkweather(int temp){
        if (temp<32){
            throw new RuntimeException("It is freezing");
        }
    }



    public static void main (String[]args){
        try{
            R213.checkweather(31);
        }catch(RuntimeException error)
        {
            System.out.println(error);
        }

    }
}


