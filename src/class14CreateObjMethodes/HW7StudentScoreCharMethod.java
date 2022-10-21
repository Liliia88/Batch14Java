package class14CreateObjMethodes;

public class HW7StudentScoreCharMethod {

    char score(int number){
        char answer='0';
        if (number>90) {
            answer = 'A';
        }else if (number>80) {
            answer = 'B';
        } else if (number>70) {
            answer = 'C';
        }  else if (number>50) {
            answer = 'D';
        } else  {
            answer='F';
        }
        return answer;
            }
    public static void main(String[] args) {
        HW7StudentScoreCharMethod obj=new HW7StudentScoreCharMethod();
        System.out.println(obj.score(91));
    }
}
