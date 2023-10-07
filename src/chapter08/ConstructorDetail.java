package chapter08;

public class ConstructorDetail {
    public static void main(String[] args) {
        Person02 person02 = new Person02("王道");
        Person02 person = new Person02("王道",20);
        System.out.println("现在输出的是构造函数的单个参数状态"+person02.name);
        System.out.println("现在输出的是构造函数的多个参数状态"+"打印输出name="+person.name+"打印输出年龄"+person.age);
//        Dog dog = new Dog();//使用的是默认的无参系统创建的构造器
    }
}

class Dog{
    //如果没有定义构造器,系统会自动给类生成一个默认无参构造器
    //使用javap指令 反编译查看
    /*
    javap能够对给定的class文件提供的字节代码进行反编译
    javap   <options>   <classes>
    常用:javap -c -v 类名
    -help   输出此用法
    -version    输出版本信息
    -v  -verbose    输出附加信息
    -l  输出行号和本地变量表
    -public 仅显示公共类和成员
    -c  对代码进行反编译
     */
    //javap Dog.class
    /*
        默认构造器
        Dog(){//参数列表中为空,所以叫做无参构造器,其中{}内的构造体也是空

        }
     */
    public Dog(String dname){//此时使用javap反编译得到源代码中的构造器就是这个构造器,而不是默认情况下的自定义构造器

    }
    Dog(){//显式的定义无参构造器,而不是直接调用,这里对于构造器的修饰符可以选择默认的不填写
        //或者手动填写构造器的修饰符
    }
}

class Person02{
    String name;
    int age;//默认0;
    //使用多个相同名称的构造器组成构造器重载,只是参数列表不同,但是代码块中的方法基本一致
    //第一个构造器
    public Person02(String name, int age) {
        System.out.println("已经使用双参数构造器");
        this.name = name;
        this.age = age;
    }
    //第二个构造器,只指定人名,不需要指定年龄
    public Person02(String name) {
        System.out.println("使用了一个单个参数的构造器");
        this.name = name;
    }
}
