package ReplsAllInteresting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class R188ScannerArraylistIterator {
        public static void main(String[] args) {

            ArrayList<Integer> numbers=new ArrayList<Integer>(5);
            for(int i=0;i<5;i++){
                numbers.add(i);
            }
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter 5 elements");

            Iterator<Integer> iterator = numbers.iterator();
            String result = "";
            System.out.println(numbers.size());
            while (iterator.hasNext()){
                int num=scanner.nextInt();
                result+=num+" ";
                iterator.next();
            } System.out.println(result);

        }
    }

