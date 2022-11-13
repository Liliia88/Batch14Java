package class28MapFile;

import java.util.LinkedHashMap;

public class HW4PersonHashMap {

        /*
        Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
         */
    private String name;
    private String lastName;
    private int age;
    private double salary;
    public HW4PersonHashMap(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    String printInfo(){
        return name+" "+lastName+" "+age+" years, "+salary+"$ salary ";

    }

    @Override
    public String toString() {
        return "HW4Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
    class Testclass{
        public static void main(String[] args) {
            LinkedHashMap<Long, HW4PersonHashMap> people=new LinkedHashMap<>();
            people.put(34562L,new HW4PersonHashMap("Lili", "Khusainova", 34,120000));
            people.put(39859L,new HW4PersonHashMap("Renat", "Khusainov", 38,300000));
            people.put(38249L,new HW4PersonHashMap("Arina","Khusainova",27,100000));
            people.put(98432L,new HW4PersonHashMap("Marat", "Khusainov",24,105000));
            for(var p:people.values()){
                System.out.println(p.printInfo());
            }
            System.out.println(people);

        }
    }

