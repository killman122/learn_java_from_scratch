package com.hspedu.extend.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
        /*
        分析:
        不难发现这里调用的是B类中的无参构造器
         */
    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}

class B extends A{
    B() {//由于存在this()在构造器的第一行,所以没有super();
        this("abc");//这里使用this来选构造器,这里的选择构造器是通过参数之间的个数来确定使用的构造器
        //不难发现this中传入的只有一个参数,所有该参数使用的构造器就是下面的带参数B(String name)
        System.out.println("b");
    }
    B(String name) {//默认一个系统调用的super();调用父类的无参构造器(注意!!此处调用的是默认的无参构造器)
        System.out.println("b name");
    }
}

//问在main函数中: B b = new B();会输出什么?
//首先,在主函数中new出一个无参构造器的实例化对象,但是在无参构造器中又调用了B的有参构造器
//有参构造器中又一个输出"b name",但是在他的构造器的入口有一个系统默认调用的super();方法调用父类的无参构造器
//所以先显示的是父类中的无参构造器默认先输出一个"a",之后B的有参构造器中输出"b name",然后B的无参构造器中输出"b"