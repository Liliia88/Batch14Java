package Class16DifferObjectMethods;

public class HW3InsideTheClassVOWELS {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */
    private String justVowels (String word){
      return  word.toLowerCase().replaceAll("[^aeiou]","");
    }
    public static void main (String[]args){
        HW3InsideTheClassVOWELS obj=new HW3InsideTheClassVOWELS();
        System.out.print(obj.justVowels("HELICOPTER"));
    }
}
