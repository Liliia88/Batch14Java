package class17CONSTRUCTOR;

public class HW3 {
/*Write a java class that have 4 constructors with 4 different access levels of constructors
(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
2 - from outside the class; 3 - from different class inside different package  and observe result.
  */
        String countryname;
        String language;
        double population;
        String neighborcountry;
    public HW3(String countryname1, String language1, double population1, String neighbor) {
        countryname = countryname1;
        language = language1;
        population = population1;
        neighborcountry=neighbor;
    }
   void printInfoDefault(){
       System.out.println("The national language of "+countryname+" is "+language+
               " and it's population is "+population+", borders with "+neighborcountry);
   }
   private void printThesameClass(){
       System.out.println("The national language of "+countryname+" is "+language+
               " and it's population is"+population+", borders with "+neighborcountry);
   }
    public void printCountrynamePublic(){

        System.out.println(countryname);
    }
   protected void printProtected(){
       System.out.println("The national language of "+countryname+" is "+language+
               " and it's population is "+population+", borders with "+neighborcountry);
   }


    public static void main(String[] args) {
        HW3 country2= new HW3("USA","English", 329.5, "Canada");
        country2.printThesameClass();
    }

}
