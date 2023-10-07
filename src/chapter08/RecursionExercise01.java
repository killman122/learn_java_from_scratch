package chapter08;

public class RecursionExercise01 {
    public static void main(String[] args) {
        /*
        Fibonacci fibonacci = new Fibonacci();
        int res = fibonacci.fibonacci_sequence(5);
        System.out.println("斐波那契数列最后的值是"+res);
         */
        Monkey_Eat monkeyEat = new Monkey_Eat();
        int res  = monkeyEat.monkey_eat(1);
        System.out.println("第1天时猴子剩的桃数"+res);
    }
}
class Fibonacci{
    /*
     使用递归的方式求解出斐波那契数1,1,2,3,5,8,13..给你一个整数n,求出它的值是多少
     思路分析:
     1:当n = 1 斐波那契数是1
     2:当n = 2 斐波那契数是2
     3:当n >= 3 斐波那契数是 前两个数的和

    */
    public int fibonacci_sequence(int num){
        int fib_num;
        if (num>=1){
            if (num == 1 || num == 2){
                fib_num = 1;
            }else {
                fib_num = fibonacci_sequence(num-2)+fibonacci_sequence(num-1);
            }
            return fib_num;
        }else {
            System.out.println("程序的输入有误,要求斐波那契的值,必须大于0");
        }
        return -1;
    }
}
class Monkey_Eat{
    /*
    猴子吃桃问题:有一堆桃子,猴子第一天吃了其中的一半桃子,并且又多吃了一个
    以后每天猴子都吃其中的一半,然后在多吃一个,可是在第十天时,还想再吃
    发现只有一个桃子了,问:最初的时候有几个桃子

    思路分析:逆向推理
    day = 10 时 有一个桃子,所以第九天吃的坑定是个奇数桃子并且九天和十天的所有桃子和为偶数
    day = 9 时 先比第十天加上一个多吃的桃子,再将倍数×2 = (1+1)*2 = 4
    day = 8 时 先比第九天多吃一个桃子,在将倍数✖2 = (4+1)*2 = 10
     */
    //出现Exception in thread "main" java.lang.StackOverflowError
    //表示出现了死循环堆栈溢出
    public int monkey_eat(int day){//day指的是第几天的桃子数目
        int tao_num;
        if (day<1){
            System.out.println("🧠涨了吗?天数还能有小于等于0的");
            return -1;
        }else {
            if(day == 10){
                tao_num = 1;
            }else {
                tao_num = (monkey_eat(day+1)+1)*2;
//            tao_num = monkey_eat(10-day)
            }
            return tao_num;
        }
    }
}
