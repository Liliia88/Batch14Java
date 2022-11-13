package class28MapFile;

import java.util.HashMap;

public class HW5HighestSalary {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {
        HashMap<String,Double> employee=new HashMap<>();
        employee.put("Liliia",125000.0);
        employee.put("Alena",123000.0);
        employee.put("Bob",124000.0);
        employee.put("Renat",300000.0);
        double highest=0;
        String name="";

        for(var ee:employee.entrySet()){
            if(ee.getValue()>highest){
                highest=ee.getValue();
                name=ee.getKey();
            }
        }
        System.out.println(name+" has the highest salary = "+highest+"$");
    }
}
