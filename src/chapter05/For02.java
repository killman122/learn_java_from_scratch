package chapter05;

/*
打印1-100之间的所有是9的倍数的整数,统计个数,以及总和
 */

public class For02 {
    public static void main(String[] args) {
        //老韩的编程技巧:将复杂的需求拆解成简单的需求逐步完成
        //先死后活:先考虑固定的值,然后转成可以灵活变化的值
        //思路分析
        /*
        完成输出 1-100的值
        在执行的过程中,过滤只输出9的倍数
        总和:定义一个变量int sum =0;当条件满足时 sum += i;
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%9 ==0){
                System.out.println(i);
                sum+=i;
            }
//            System.out.println(i);
        }
    }
}
