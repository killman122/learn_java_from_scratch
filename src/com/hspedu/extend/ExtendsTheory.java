package com.hspedu.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        /*
        由于继承关系,在内存中,创建出Son对象,和他的所有父类
        也就是包含了他的父类继承的父类
         */
        //(1)首先观察子类中是否有该属性
        //(2)如果子类中有这个属性,并且可以访问,则返回信息
        //(3)如果子类中没有这个属性,就观察父类中有没有这个属性(如果父类中有该属性,且可以访问,则返回该父类中的属性)
        //(4)如果父类中没有按照(3)的规则,继续向上查找,直到查找到Object类,还没有则报错
        System.out.println(son.name);//返回的就是小头儿子
        System.out.println(son.hobby);//son类中没有该属性,但是由于是继承类,所以属性有Son类的父类提供
        //如果将Father类中的age属性设置为私有,则在输出时由于私有无法从子类访问父类中私有属性报错System.out.println(son.age);
        System.out.println(son.getAge());//通过在父类中添加一个公有的get方法取值,取得私有的属性
    }
}
class GrandPa{
    String name = "大头爷爷";
    String hobby = "钓鱼";
}

class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father{
    String name = "小头儿子";
}