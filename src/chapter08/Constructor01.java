package chapter08;

public class Constructor01 {
    public static void main(String[] args) {
        /*
         chapter08.Person01
        @Contract(pure = true)
        public Person01(
            String name,
            int age
        )
         */
        //当new 一个对象时,直接通过构造器指定名字和年龄
        Person01 p1 = new Person01("王道", 80);//创造对象的时候直接调用构造函数,初始化
        System.out.println("p1的信息如下");
        System.out.println("p1对象name="+p1.name);
        System.out.println("p1对象age="+p1.age);
    }
}

//在创建对象的时候,直接指定这个对象的年龄和姓名
class Person01{
    String name;
    int age;
    //构造器(完成对象的初始化)
    //构造器没有返回值,就是没有void,int等关键字
    //在构造器的创建过程中,this关键字是可选的
    //构造器的名称和类一样
    //其中参数的形参列表和成员方法的使用规则一样,形参列表中的参数名称可以改变
    public Person01(String name, int age) {
        System.out.println("构造器被调用~ 完成对象");
        this.name = name;
        //name = name;
        this.age = age;
        //age = age;
    }
}
