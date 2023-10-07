package com.hspedu.extend.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC cc = new CC();
        /*
        new 一个CC类对象将引用传递给 cc变量,使得cc变为一个对象
        CC继承于BB,BB继承于AA,在实例化时因为使用的是CC的无参构造器,
        但是在无参构造器的第一行中使用this()调用有参构造器并传入参数字符串"hello"
        在有参构器中使用super()并传入字符串"哈哈哈"调用父类B的有参构造器,父类B的有参构造器
        默认系统使用一个super();调用B的父类A的无参构造器,并在调用后输出"哈哈哈我是B类的有参构造"
        让后向递归一样层层返回

         总的来说,打印的结果就是:
         我是AA类
         哈哈哈我是BB类的有参构造
         我是CC类的有参构造
         我是CC类的无参构造
         */
    }
}

class AA {//AA 类

    public AA() {// 默认情况下构造器使用的是public权限访问修饰符
        System.out.println("我是A类");
    }
}

class BB extends AA {
    public BB() {
        System.out.println("我是B类的无参构造器");
    }

    public BB(String name) {
        System.out.println(name + "我是B类的有参构造器");
    }
}

class  CC extends BB{
    public CC() {
        this("hello");
        System.out.println("我是cc类的无参构造器");
    }

    public CC(String name) {
        super("哈哈哈");
        System.out.println("我是cc类的有参构造器");
    }
}

//问:在main()方法中: CC cc = new C();输出什么内容