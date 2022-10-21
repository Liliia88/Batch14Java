package ReplsAllInteresting;

public class R127StaticAndNonStatic {
    void sentence1 (){
        System.out.println("Programming is amazing.");
    }
    static void sentence2(){
        System.out.println("Java is awesome.");
    }
    public static void main(String[]args){
        R127StaticAndNonStatic obj=new R127StaticAndNonStatic();
        obj.sentence1();

        R127StaticAndNonStatic.sentence2();
    }
}
