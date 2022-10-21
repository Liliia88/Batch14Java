package ReplsAllInteresting;

public class R152Super {

        String city;

    R152Super (String city){
            this.city=city;
            System.out.println(city);
        }

    R152Super (){
            System.out.println("Parent Constructor");
        }
    }
class Child extends R152Super{
    Child(String city){
        super(city);
    }}
class Main10 {
    public static void main(String[]args){
        new Child("Vienna");
    }
}


