package ReplsAllInteresting;

abstract class R173AbstractMethod {
    String teaType;
    R173AbstractMethod (String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class LemonTea extends R173AbstractMethod {
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends R173AbstractMethod {
    ChaiTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}

class Main30 {
    public static void main (String[]args){
        LemonTea lemont=new LemonTea("Lemon Tea");
        lemont.addSugar();
        ChaiTea chait=new ChaiTea("Chai Tea");
        chait.addSugar();
    }

}

