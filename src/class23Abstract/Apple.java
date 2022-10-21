package class23Abstract;

public class Apple extends ReviewAselFruit{
    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size){
        super(name,shape,color);
        this.size=size;
        //super(name); super should be 1st line,
        // so both supers not work
    }
   // Apple(String size){
   //     this.size=size;you should use constructor from parent class

    //}
    Apple(String name,String shape, String color,String size, String taste, double price) {
        this(name, shape, color, size);
        this.taste = taste;
        this.price = price;
    }

    public static void main(String[] args) {
        Apple app=new Apple("apple","circle","red", "big");
       // app.color; not visible since it access private
        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(ReviewAselFruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();
        app.haveBenefits();

    }
}
