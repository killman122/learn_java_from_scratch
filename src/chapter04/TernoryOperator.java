package chapter04;

/**
 *
 */

public class TernoryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        //解读:a > b 为 false
        //由于是false,所以返回的是三元运算符中的后面的语句,b--
        //b--先将b的数据返回赋值给左边表达式,之后将b的值增加一个
        //所以返回的结果是99
        int result = a > b ? a++ : b--;
        System.out.println("result的结果是"+result);
//        new MaxNumber().Max(55,33,123);
        MaxNumber.Max1(55,33,123);

    }
}

class MaxNumber{
    //实现三个数的最大值
    //思路
    /**
     * 先得到n1和n2中的最大数,保存到max1
     * 然后在求出 max1 和 n3中的最大值,保存到max2
     */
    void Max( int x,int y,int z){
        int max = x > y ? x : y;
        max = max > z ? max : z;
        System.out.println("三个数中的最大值是"+ max);
    }

    static void Max1( int x,int y,int z){
        int max = x > y ? x : y;
        max = max > z ? max : z;
        System.out.println("三个数中的最大值是"+ max);
    }
}
