package com.hspedu.super_;

public class B extends A{
    /**
     * 访问父类的属性,但是不能访问父类的private属性
     */
    public void hi(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3);
    }
    //访问父类的方法,但是不能访问父类的private方法
    public void ok(){
        super.test100();//调用父类的方法
        super.test200();
        super.test300();
//        super.test400();//不能访问父类中的私有方法
    }

    public B() {
        //super();//不填参数的情况下调用默认无参的构造器
        //如果不写super()默认情况下系统调用的也是无参的构造器
        //super("王道");//调用的是父类A中的public A(String name){}构造器
        super("王道",21);//调用的是父类A中的public A(String name,int age){}构造器
    }
}
