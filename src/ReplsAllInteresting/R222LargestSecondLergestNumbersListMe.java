package ReplsAllInteresting;

import java.util.ArrayList;
import java.util.List;

public class R222LargestSecondLergestNumbersListMe {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(5);

        System.out.println (numbers);
        System.out.println (findMaxSum(numbers));
    }

    public static int findMaxSum(List<Integer> list) {
        int largest= 0;
        int largest2=0;

        for (int num:list) {
            if (num>largest) {
                largest=num;
            }
        } for (int num2:list)	{
            if (num2>largest2 && num2<largest) {
                largest2=num2;
            }
        }
        return largest2+largest;
    }
}


