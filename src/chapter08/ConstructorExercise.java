package chapter08;
/*
在前面定义的Persons类中添加两个构造器;
第一个无参构造器:利用构造器设置所有人的age属性初始值都是18
第二个带pName和pAge两个参数的构造器:使得每次创建Person对象的同时初始化对象
的age属性值和name属性值,分别使用不同的构造器,创建对象
 */
public class ConstructorExercise {
    public static void main(String[] args) {
        Persons persons0 = new Persons();//使用的是无参构造器没有传入实参到形参列表中

        //下面输出 name = null,age = 18,使用的是无参构造器的默认name默认情况是null,age是自行在无参构造器中赋值的默认为18
        System.out.println("person0的信息 name="+ persons0.name+" age = "+ persons0.age);
        //使用自定义的有两个形参的构造器
        Persons person1 = new Persons("王道",21);
        System.out.println("person1的信息 name="+ person1.name+" age="+ person1.age);
        //person1只是对象的引用但是不是真正的对象
        /*
        流程分析:
        加载Person类信息(Person.class),之会加载一次
        在堆中分配空间(地址)
        完成对象初始化(默认初始化name = null,age = 0,显式初始化(无参构造器中) age =90,name =null,自定义有参构造器初始化 age =21,name ="王道")
        将对象在堆中的地址,返回给p,(p是对象名,也可以理解成对象的引用)
         */
    }
}

class Persons{
    String name;//默认值为null
    int age;//默认值为0
    //无参构造器
    public Persons(){//由于形参列表没有参数,所以叫做无参构造器,至于函数体中是否有则无关
        //在无参构造器中默认情况下,String类型赋值为null,int为0
        //age = 18;
        this.age = 18;
    }
    public Persons(String pName,int pAge){
        this.name = pName;
        //name = pName;
        this.age = pAge;
        //age = pAge;
    }
}
