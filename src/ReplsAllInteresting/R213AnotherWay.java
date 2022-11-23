package ReplsAllInteresting;

public class R213AnotherWay {
    static void checkweather(int temp) {
        try{
            if (temp<32){
                throw new RuntimeException("It is freezing");
            }
        }catch(RuntimeException error)
        {
            System.out.println(error);
        }
    }
    public static void main (String[]args){
       checkweather(31);
    }
}

