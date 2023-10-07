package chapter04;

/**
 * 演示算术运算符的使用
 */

public class ArithmeticOperator {//arithmetic 算术 operator 运算符
    public static void main(String[] args) {
        // /号的使用
        System.out.println(10/4); //从数学的角度结果是2.5,在Java中的数据精度到整数
        System.out.println(10.0/4);//从Java中的结果是2.5,因为数据的精度不同,10.0作为一个double类型数据,和一个int类型的数据计算,保留一个高精度类型数据混合运算,可以达到数学中的数据结果
        double d = 10/4;//在这里先将结果计算出,后面使用double类型的变量存储数据,所以数据的尾数会保留一位
        System.out.println(d);

        //关于取模运算的使用,取余数
        //在Java中取模的本质% 公式 a % b = a - a / b * b
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1  -10-(-10)/3*3 ==> -10-(-9) ==>-10+9=-1
        System.out.println(10%-3);//1   10-10/(-3)*(-3) ==> 10-9=1
        System.out.println(-10%-3);//-1  (-10)-(-10)/(-3)*(-3) ==> (-10)-3*(-3) ==> (-10)+9 =-1

        //++自增,如果独立使用i++/++i的作用效果完全等价于i=i+1
        int i =10;
        i++;
        ++i;
        System.out.println("i="+i);

        /**
         * 作为表达式使用
         * 前++:++i先自增后赋值
         * 后++:i++先赋值后自增
         */

        int j = 8;
        int k = ++j;//等价于 j = j + 1; k = j;前置++就是先自增后运算,后置++就是先运算后自增
        k = j++;//等价于 j = j + 1; k = j;前置++就是先自增后运算,后置++就是先运算后自增

        System.out.println("k="+k+"j="+j);
    }
}
