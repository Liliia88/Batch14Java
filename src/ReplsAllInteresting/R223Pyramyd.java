package ReplsAllInteresting;

public class R223Pyramyd {
    public static void main(String[] args) {
        int a=5;
        for(int row=1;row<=a;row++){
            int count=row*2-1;
            int left_space_count = (a-row)*2;

            String line="";
            String left_space="";

            //generate spaces for each row
            for(int c=0;c<left_space_count;c++){
                left_space +=" ";
            }

            for(int colomn=0;colomn<count;colomn++){
                if(colomn != (count-1))
                {
                    line += a+" ";
                }else
                {
                    line += a;
                }
            }
            System.out.println(left_space+line);
        }
    }
}


