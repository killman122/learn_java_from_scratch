package chapter08;

public class Recursion01 {
    public static void main(String[] args) {
        T t = new T();
        t.test(4);
        int res = t.factorial(5);
        System.out.println("这里测试打印输出一个返回值,应该是一个阶乘的计算结果"+res);
    }
}
class T{
    public void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
    public int factorial(int n){//factorial阶乘
        if (n==1){
            return 1;
        }else {
            return factorial(n-1)*n;
        }
    }
}
