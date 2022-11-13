package class26ArrayLinkedList;
import java.util.HashSet;
import java.util.Iterator;
public class HW6StudentsForLWhileIterator {
    String name;
    int id;
    HW6StudentsForLWhileIterator(String name, int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString() {
        return "HW6StudentsForLWhileIterator{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion
         order. Each student object should have name and studentID. Display name of each student.
         */
        /*HW6StudentsForLWhileIterator student1=new HW6StudentsForLWhileIterator("Liliia", 5509);
        HW6StudentsForLWhileIterator student2=new HW6StudentsForLWhileIterator("Elena", 5508);
        HW6StudentsForLWhileIterator student3=new HW6StudentsForLWhileIterator("Josely", 5507);
        HW6StudentsForLWhileIterator student4=new HW6StudentsForLWhileIterator("Lisa", 5506);

        HashSet<HW6StudentsForLWhileIterator> hashSet=new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
*/       HashSet<HW6StudentsForLWhileIterator> students=new HashSet<>();
        students.add(new HW6StudentsForLWhileIterator("Liliia", 5509));
        students.add(new HW6StudentsForLWhileIterator("Elena", 5508));
        students.add(new HW6StudentsForLWhileIterator("Josely", 5507));
        students.add(new HW6StudentsForLWhileIterator("Lisa", 5506));

        System.out.println(students);
        /// System.out.println(hashSet);
        for (HW6StudentsForLWhileIterator list : students) {
            System.out.print(list.name+" ");
        }
        System.out.println();
        Iterator<HW6StudentsForLWhileIterator> iterator =students.iterator();

        while (iterator.hasNext()){
            HW6StudentsForLWhileIterator item= iterator.next();
            System.out.print(item.name+" ");
        }
    }
}
