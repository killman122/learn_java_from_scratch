package com.hspedu.modeifer;

public class A {
    //四个属性,分别使用不同的修饰符访问
    public int n1 = 100;
    protected int n2 = 100;
    int n3 = 100;
    private int n4 = 100;

    public void m1() {//该方法可以访问四个属性
        System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3 + "n4=" + n4);
    }

}
