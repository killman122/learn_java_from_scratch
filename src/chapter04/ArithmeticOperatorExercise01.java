package chapter04;


/**
 * 面试题1
 * int i = 1;
 * i = i++;//规则使用一个临时变量temp=i; i=i+1; i=temp;
 * System.out.println(i);
 * 问:结果是什么?为什么
 * 答:i++是一个后置增加,先赋值后增加,所以先将传递过来的1赋值给i,所以打印输出的是1
 *
 *
 * 面试题2
 * int i = 1;
 * i = ++i;
 * System.out.println(i);
 */

public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//规则使用一个临时变量temp=i; i=i+1; i=temp;
        System.out.println(i);

        int j = 1;
        j = ++j;//i=i+1;temp=i;i=temp;
        System.out.println(j);
    }
}
