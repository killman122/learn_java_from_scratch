package chapter08;

/*
编写程序,类Methods中定义三个重载方法并调用,方法名为m,三个 方法分别接收一个int参数,
两个int参数,一个字符串参数.分别执行平方运算并输出结果,相乘并输出结果,输出字符串信息,
在主类的main()方法中分别用参数区别调用三个方法

在Methods类,定义三个重载方法max(),第一个方法,返回两个int值中的最大值,
第二个方法,返回两个double值中的最大值,第三个方法,返回三个double值中的最大值,并
分别调用三个方法
 */
public class OverLoadExercise {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(5);
        methods.m(2,3);
        methods.m("What Fuck");
        int max = methods.max(1,6);
        System.out.println("现在输出的是两个整数变量之间的最大值"+max);
        double max0;
        max0 = methods.max(6.6,8.8);
        System.out.println("现在输出的是两个double类型变量中的最大值"+max0);
        max0 = methods.max(6.6,8.8,188.8);
        System.out.println("现在输出的是三个double类型变量中的最大值"+max0);
    }
}
class Methods{
    //分析
    //1.方法名 m
    //2.形参 (int)
    //3.void 由于是输出运算结果,所哟没有返回值
    public void m(int a){
        System.out.println("平方="+a*a);//直接使用两个数相乘的计算结果是int类型
        System.out.println("平方="+Math.pow(a,2));//使用Math.pow()计算出阶乘后的值是double类型数据
    }
    public void m(int a,int b){
        System.out.println("两个数相乘"+a*b);
    }
    public void m(String a){
        System.out.println("字符串的信息为"+a);
    }
    public int max(int a,int b){
        return a>b?a:b;
//        return Math.max(a, b);
    }
    public double max(double a,double b){
        return a>b?a:b;
//        return Math.max(a, b);
    }
    public double max(double a,double b,double c){
        //先求出a和b的最大值
        //使用a/b的最大值和c比较,返回其中的最大值
        double max = a>b?a:b;
        max = max>c?max:c;
        return max;
    }

}
