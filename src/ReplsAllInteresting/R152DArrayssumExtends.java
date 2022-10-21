package ReplsAllInteresting;

 class R152DArrayssumExtends {

        static int sum2D() {
            int [][] a= { {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            int sum=0;
            for (int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    sum+=a[i][j];
                }
            } return sum;
        }
    }
class Main24 extends R152DArrayssumExtends {
    public static void main(String[] args) {
        int result=R152DArrayssumExtends.sum2D();
        System.out.println(result);
    }
}

