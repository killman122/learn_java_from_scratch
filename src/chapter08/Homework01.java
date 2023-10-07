package chapter08;

public class Homework01 {
    public static void main(String[] args) {
        /*
        编写类A01,定义方法max,实现求某个double数组的最大值,并返回
         */
        A01 a01 = new A01();
        double a[] = {1,2.0,3.0,8.8,66.0};
        double res = a01.max(a);
        System.out.println("这个数组中的最大值是"+res);
    }
}
class A01{
    double max = 0;
    public double max(double...a){
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}