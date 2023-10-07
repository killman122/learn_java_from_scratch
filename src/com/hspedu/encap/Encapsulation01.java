package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();//没有手动创建构造器,使用系统默认的无参构造器
        person.name = "王道";
//        person.setName("王道");
        person.setAge(20);
        person.setSalary(20000);
        //person.age=11;//对于私有的属性不能直接赋值,需要使用set方法,取值的时候也要使用get方法
        System.out.println(person.info());

        //如果通过构造器直接指定属性
        Person wangdao = new Person("wangdao", 2000, 50000);
        System.out.println("wangdao的信息");
        System.out.println(wangdao.info());
    }
}

/*
设计一个程序,不能随便查看人的年龄,工资等隐私,并对设置的年龄进行合理的验证,年龄合理就设置
否则就默认(Encapsulation01.java)

年龄,必须在1-120,年龄,工资不能直接查看,name的长度在2-6字符之间
 */
class Person {
    public String name;//名字公开
    private int age;//age私有化
    private double salary;//工资私有化

    //构造器
    public Person() {
        System.out.println("被调用");
    }
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写在构造器中,仍然可以验证数据
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    //使用alt+insert快速添加set和get方法
    //根据要求完善代码
    public void setName(String name) {
        //接入对数据的校验
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("名字的长度不对,需要2-6个字符,默认名字");
            this.name = "无名小子";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        //可以增加对当前对象的身份判断
        return salary;
    }

    public void setAge(int age) {
        //判断年龄是否在1-120之间
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄需要在1-120,给出的默认年龄为18");
            this.age = 18;//给出的默认年龄
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + "薪水=" + salary;
    }
}
