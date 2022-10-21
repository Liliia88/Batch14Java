package ReplsAllInteresting;

public class R119ReplacemETHOD {

    void censorletter(String word,char sign){
        System.out.println(word.replace(sign,'*'));
    }

    public static void main (String[]args){
        R119ReplacemETHOD obj=new R119ReplacemETHOD();
        obj.censorletter("computer science",'e');
        obj.censorletter("trick or treat",'t');
    }
}
