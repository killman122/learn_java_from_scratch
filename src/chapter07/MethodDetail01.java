package chapter07;

public class MethodDetail01 {
    public static void main(String[] args) {
        A a = new A();
        a.sayOk();
        a.m1();
    }
}
class A{
    //同一个类中的方法调用:直接调用即可,不需要创建对象
    public void print(int n){
        System.out.println("print()方法被调用 n="+n);
    }
    public void sayOk(){
        //在sayOk中调用print()方法
        print(10);
        System.out.println("继续执行sayOk()");
    }
    //跨类中的方法A类调用B类方法:需要通过对象名调用
    public void m1(){
        System.out.println("B类中的hi通过A类中的m1跨类调用");
        //创建一个B的对象
        B b = new B();
        b.hi();
        System.out.println("m1()继续执行:");
    }
}

class B{
    public void hi(){
        System.out.println("B类中的hi()被执行");
    }
}