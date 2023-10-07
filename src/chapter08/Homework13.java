package chapter08;

public class Homework13 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();//由于在创建的时候没有给出半径,需要在后面赋值,所以
        PassObject passObject = new PassObject();
        passObject.printAreas(circle1, 5);
    }
}

/*
定义一个Circle类,包含一个double型的radius属性代表圆的半径,findArea()方法返回圆的面积
定义一个类PassObject,在类中定义一个方法printAreas(),该方法的定义如下
public void printArea(Circle c,int times)//方法签名/声明

在printAreas方法中打印输出1到times之间的每个整数的半径数据值,以及对应的面积
例如:times为5,则输出半径1,2,3,4,5以及对应的圆面积

在main方法中调用printAreas()方法,调用完毕后输出当前半径值
 */
class Circle1 {
    double radius;//属性

    public Circle1() {//创建一个默认无参的构造器
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double findArea() {//返回面积
        return Math.PI * radius * radius;
    }
    //添加方法setRadius,修改对象的半径值,而不是添加新的对象

    public void setRadius(double radius) {//给出一个局部变量的形参.使用set方法可以更改一个对象的属性,不需要重复创建多个对象
        this.radius = radius;//将局部变量形参赋值给属性
    }
}

class PassObject {
    public void printAreas(Circle1 c, int times) {
        System.out.println("radius\tarea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);//修改circle对象的半径值
            System.out.println(i + "\t" + c.findArea());
        }
    }
}