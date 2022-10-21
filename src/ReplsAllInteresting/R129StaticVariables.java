package ReplsAllInteresting;

public class R129StaticVariables {
    static String countryname;
    static String continent;

    void sentence(){
        System.out.println(countryname+" located on "+continent+" continent");
    }
    public static void main(String[]args){
        R129StaticVariables.countryname="Morocco";
        R129StaticVariables.continent="Africa";
        R129StaticVariables obj=new R129StaticVariables();
        obj.sentence();

    }
}
