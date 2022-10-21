package ReplsAllInteresting;

public class R122Objects2 {
    String countryName;
    String capital;
    int size;
    void result(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+size);
    }
    public static void main (String[]args){
        R122Objects2 obj=new R122Objects2();
        obj.countryName="USA";
        obj.capital="Washington DC";
        obj.size=330000000;
        obj.result();

        R122Objects2 obj2=new R122Objects2();
        obj2.countryName="Kazakhstan";
        obj2.capital="Astana";
        obj2.size=18500000;
        obj2.result();
    }
}
