package chapter08;

/*
方法的重载
重载:指的是 函数/方法 的 函数名/方法名 一样但是形参列表不一样
重载的好处:
减轻了起名的麻烦
减轻了的记名的麻烦
 */

//方法重载的注意事项和细节
//方法名:必须相同
//参数列表:必须不同(参数类型或者个数或顺序,至少有一样不同,参数名无要求)
//返回类型:无要求,无论是否有返回值,或者是返回值的类型是否相同

public class OverLoad01 {
    public static void main(String[] args) {
//        System.out.println(100);
//        System.out.println("hello,world");
//        System.out.println('h');
//        System.out.println(1.1);
//        System.out.println(true);
        MyCalculator myCalculatorc = new MyCalculator();
        System.out.println(myCalculatorc.calculate(1,2));
    }
    /*
    案例:类:MyCalculator   方法:calculate()
    calculate(int n1,int n2)
    calculate(int n1,double n2)
    calculate(double n2,int n1)
    calculate(int n1,int n2,int n3),
     */

}
class MyCalculator{
    /**
     * 两个整数的和
     * @param n1
     * @param n2
     */
    public int calculate(int n1,int n2){
        return n1+n2;
    }

    /**
     * 一个整数一个double类型数据
     * @param n1
     * @param n2
     * @return
     */
    public double calculate(int n1,double n2){
        return n1+n2;
    }

    /**
     * 一个double,一个int的和
     * @param n1
     * @param n2
     * @return
     */
    public double calculate(double n1,int n2){
        return n1+n2;
    }

    /**
     * 三个int整型数据的和
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public int calculate(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
