package ReplsAllInteresting;

public class R81LargestNumArrays2d {
    public static void main(String[] args) {
        int[] numbers={5,4,8};
        int largest=numbers[0];
        for (int num:numbers){
            if(num>largest){
                largest=num;
            }
        }System.out.println(largest);
    }
}
