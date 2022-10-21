package class17CONSTRUCTOR;

public class DogReviewAsel {
    String name; //instance
    int weight;
    static String breed;
// when we do not create a c, compiler creates a default c for us.
    void printInfo(){

        System.out.println("Dog features:"+name+","+","+breed);
    }
    void love(String thing){  //a value that we declare ,string thing - parameter

        System.out.println(name+"loves"+thing);
    }

    //void -  mojet prinimat parametri ili ne prinimat/ no eto ne szyazano
    // s tem chto on ne vozvrashaet dannie.
    //lubaya funkciya mojet prinimat parametri/ ne vajno vozvrashaet ili net dannie

    /* variables syntax
     dataType name
     String breed;

     method syntax
    returnType name
    void printInfo
     */
    float getPrice() {
        if (weight < 5) {
            return 100;
        } else if (weight < 10) {
            return 300;
        } else {
            return 1000;
        }
    }
        String bark() {
            String noise;
            if (weight<5) {
                noise = "loud";
            }else if (weight<20){
                noise="woof woof";
            } else {
                noise="GAV GAV";
            }
            return noise;
        }

}
