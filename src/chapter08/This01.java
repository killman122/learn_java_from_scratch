package chapter08;

public class This01 {
    public static void main(String[] args) {
        Dog0 dog0 = new Dog0("大牛",2);
        System.out.println("dog0的hashcode编码值为"+dog0.hashCode());
        //使用hashcode查看的是一整个对象的hash值不是一个对象中某个属性的hash值,也没有办法查看属性的haskcode
        dog0.info();
    }
}

class Dog0{
    String name;
    int age;
//    public Dog0(String dName,int dAge){//自定义的有参构造器
//        name = dName;
//        age = dAge;
//    }
    //如果将构造器的形参,能够直接写成属性名,就很好,代码阅读性更好
    public Dog0(String name, int age) {
        name = name;//但是出现一个问题,根据变量的作用域原则,构造器name是局部变量name而不是属性
        this.name = name;//Java虚拟机给每个对象分配this,代表当前对象
        this.age = age;//使用this解决变量命名的问题
        //this.name 代表当前对象的属性name
        //this.age  代表当前对象的属性age
        //this指的是在main函数中new出的对象,在这段代码中
        //在这里对象的hashcode值与在main函数中的hashcode值相同
    }

    public void info(){//成员方法/函数,输出属性信息
        System.out.println(name+"\t"+age+"\t");
    }
    //使用hashCode可以查看对象的hash码值,在不同的对象返回不同的hash码值
    //哪个对象调用了哪个方法那么这个对象的地址就传入这个方法中,改变了原来调用这个方法的hashcode
}