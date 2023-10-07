package chapter07;

/*
编写类AAA,有一个方法:判断一个数是奇数odd还是偶数,返回boolean
 */
public class MethodExercise01 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
//        boolean res = aaa.judgement(4);
//        System.out.println(res);
        /*
        if (aaa.judgement(2)){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
         */
        aaa.paint(30,30);
    }
}
class AAA{
    public boolean judgement(int num){
        boolean res;
        if (num % 2==0){
            System.out.println("这个数"+num+"是个偶数");
            res = true;
        }else {
            System.out.println("这个数"+num+"是个奇数");
            res = false;
        }
        return res;
        // return num % 2 != 0 ? true ; false ;
        // return num % 2 != 0  如果使用直接不是三目运算的时候,将运算符的返回true/false直接带入主函数的判断中.主函数采用二分支语句
    }
    //根据行,列,字符打印    对应的行数和列数的字符
    //比如:行4 列4 字符#,则打印对应的效果
    /*
        ####
        ####
        ####
        ####
     */
    public void paint(int row,int col){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
