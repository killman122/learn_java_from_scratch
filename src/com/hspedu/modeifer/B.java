package com.hspedu.modeifer;

public class B {
    public void say(){
        A a = new A();//在同一个包下,不需要使用import导入所在的包
        //可以访问public ,protected 和默认,但是不能访问private
        System.out.println("n1="+a.n1+"n2="+a.n2+"n3="+a.n3);

    }
}
