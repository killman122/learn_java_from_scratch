package chapter08;

import javax.xml.namespace.QName;

public class VarScope {
    public static void main(String[] args) {

    }
}
class Cat{
    //属性在定义的时候可以直接赋值
    //可以调用属性,但是不能在一个类中相互调用类中两个函数中的不同的变量
    int age = 10;
    //对于代码块中创建的局部变量也是没有办法在代码块的外部调用
    {
        int num =10;
    }
    public void cry(){
        //局部变量一般指的是在成员方法中定义的变量
        //n和name就是局部变量
        //n和name的作用域在cry()方法中
        int n = 10;
        String name = "王道";
        System.out.println("在cry中使用属性 age=" +age);
    }
    public void eat(){
        System.out.println("age="+age);
    }
}
