package class23Abstract;

public class ReviewAselFruit {
    protected String name;
    String shape;
    private String color;
    static boolean fresh;

    public ReviewAselFruit(String name){
        this.name=name;
    }
    ReviewAselFruit(String name, String shape, String color){
        this(name);
        this.shape=shape;
        this.color=color;
    }
    public void grow(){
        System.out.println("All fruits grow fresh "+fresh);
    }
    protected void haveBenefits(){
        System.out.println("");
    }

    public static void main(String[] args) {

    }


}
