package chapter08;

public class Homework06 {
    public static void main(String[] args) {
        Cale cale = new Cale(2,0);
        System.out.println("和"+cale.calsum());
        System.out.println("差"+cale.calminus());
        System.out.println("积"+cale.calmul());
        if (cale.caldiv() == -1)
            System.out.println("分母的除数异常");
        else
            System.out.println("商"+cale.caldiv());
    }
}
/*
实现一个Cale计算类,在其中定义两个变量表示两个操作数,定义四个方法实现求和,
差,乘,商(要求除数为0的话,提示报错)并创建两个对象,分别调试
 */
class Cale{
    double num1;
    double num2;

    //构造器用来初始化对象的属性
    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calsum(){
        return this.num1+this.num2;
    }
    public double calminus(){
        return this.num1-this.num2;
    }
    public double calmul(){
        return this.num1*this.num2;
    }
    public double caldiv(){
        if (num2 == 0){
            return -1;
        }
        return this.num1/num2;
    }
}