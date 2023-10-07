package chapter08;

import javax.xml.namespace.QName;

public class VarScopeDetail {
    //属性和局部变量可以重名,访问时遵循就近原则
    //在同一个作用域中,比如在同一个成员方法中,两个局部变量,不能重名
    //属性的生命周期较长,伴随着对象的死亡而死亡,局部变量,生命周期较短
    //伴随着代码块的执行而创建,伴随着代码块的结束而死亡,即在一次方法调用的过程中
    public static void main(String[] args) {
        Person person = new Person();
        person.say();//当执行say()方法时,say方法的局部变量比如name,会创建,但当say执行完毕后
        //name局部变量被销毁,但是属性全局变量还是可以使用
        TTT ttt = new TTT();
        ttt.test();//第一种方式访问对象属性的方法
        ttt.test2(person);//第二种方式跨类访问对象属性的方式
    }
}
class TTT{
    public void test(){//通过生成类的对象在不同的函数中调用,但是不包括不同类不同函数中什么的方法
        Person person = new Person();
        System.out.println(person.name);//输出王道
    }

    public void test2(Person p){//传入了一个Person对象p,但是实际上传入的实参使用的是在main函数中创建的对象person
        System.out.println(p.name);
    }
}

class Person{
    //属性可以添加修饰符(public,protected,private)
    //局部变量不能添加修饰符
    public int age = 10;

    String name = "王道";

    public void say(){
        //细节 属性和局部变量可以重名,访问时遵循就近原则
        //这里中的局部变量不能添加修饰符
        String name = "wangdao";
        System.out.println("say() name="+name);
    }

    public void hi(){
        String address = "北京";

    }
}
