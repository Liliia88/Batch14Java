package class14CreateObjMethodes;

public class MethodForStringSeveralTimesWord {
    void printManytimes(int times){
        for(int i=0;i<times;i++){
            System.out.println("Hello Java");
        }
    }
    // in Parameters sequence and data type matters
 void printCustomWordManyTimes(String word, int times){
        for(int i=0; i<times; i++){
            System.out.println(word);
        }
 }
    public static void main(String[] args) {
        MethodForStringSeveralTimesWord md=new MethodForStringSeveralTimesWord();
      //  md.printManytimes(5);
        md.printCustomWordManyTimes("Syntax Easy",3);
    }
}
