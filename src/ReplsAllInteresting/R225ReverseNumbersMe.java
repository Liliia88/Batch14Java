package ReplsAllInteresting;

public class R225ReverseNumbersMe {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }
    public  static int reverseInteger(int N){
        String numbers="";
        String str = String.valueOf(N);
        String[] num=str.split("");
        for (int c=num.length-1;c>=0;c--){
            numbers+=num[c];
        }
        String q = new String(numbers);
        int r = Integer.parseInt(q);
        return r;
    }

}

