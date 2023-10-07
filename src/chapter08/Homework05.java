package chapter08;

public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.show();
        circle.showArea();
    }
}
/*
定义一个圆类Circle,定义属性:半径,提供显示圆周长功能的方法,
提供显示圆面积的方法
 */
class Circle{
    double radio;//定义属性半径

    public Circle(double radio) {
        this.radio = radio;
    }

    public void show(){
        //根据圆的周长公式2ΠR
        double chang = this.radio*2*Math.PI;
        System.out.println("圆的周长为"+chang);
    }
    public void showArea(){
        double s = Math.PI*this.radio*this.radio;
        System.out.println("显示圆的面积为"+s);
    }
}
