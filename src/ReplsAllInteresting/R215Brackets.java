package ReplsAllInteresting;

public class R215Brackets {

    public static void main(String[] args) {
        R215Brackets object=new R215Brackets();

        System.out.println(object.isBalanced("())"));
    }


    public boolean isBalanced(String s){
        int open_num=0;
        int close_num=0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) =='(')
            {
                open_num++;
            }else  if(s.charAt(i) == ')')
            {
                close_num++;
            }
        }
        if(open_num == close_num) return true;
        return false;
    }
}

