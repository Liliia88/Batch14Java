package Class16DifferObjectMethods;
public class SergeiTask {
    /* Дали String aaaabbcccccddaa
    Надо получить a4b2c5d2a2
*/
    public static void main(String[] args) {
        String word = "aaaabbcccccddaa";
        int sum1 = 0;
        int sum2 = 0;
        int sum3=0;
        int sum4=0;
        int sum5=0;
        for (char i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                sum1++;
                } if (word.charAt(i)=='d'){
                break;
        }  else  if (word.charAt(i) == 'b' ) {
                sum2++;
        }  else if (word.charAt(i) == 'c' ) {
                sum3++;
            } }
        for (char j = 0; j < word.length(); j++) {
              if (word.charAt(j) == 'd' ) {
                  sum4++;
              } else if (word.charAt(j) == 'a') {
            sum5++;
    }}sum5=sum5-sum1;
        System.out.println("a"+sum1+"b"+sum2+"c"+sum3+"d"+sum4+"a"+sum5);
}}