package class14CreateObjMethodes;

public class HW4SayHello {
    void say(String country){
        String answer=null;
        if ("USA".equals(country)) {
            answer = "hi";
        } else if ("Russia".equals(country)) {
            answer = "privet";
        } else if ("Spain".equals(country)) {
            answer = "holla";
        } else if ("France".equals(country)) {
            answer = "salut";
        } else {
            answer = "incorrect";
        }
        System.out.println(answer);

    }

    public static void main(String[] args) {
        HW4SayHello w=new HW4SayHello();
        w.say("USA");
    }
}
