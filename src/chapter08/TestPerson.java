package chapter08;

import javax.xml.namespace.QName;

/*
定义Person类,里面有name,age属性,并提供比较方法compareTo,用于判断是否和另一个人相等
,提供测试类TestPerson用于测试,名字和年龄完全一样,就返回true,否则返回false
 */
public class TestPerson {
    public static void main(String[] args) {
        Person03 person03 = new Person03("mary",18);
        Person03 person02 = new Person03();
        System.out.println("name的值为 "+ person02.name+" age的值为"+person02+ person02.age);
        Person03 person04 = new Person03("mary",18);
        System.out.println("person03和person04比较的结果是"+person03.compareTo(person04));//person03的值为"mary",18,person04的值为"ry",18
        //person03指的是第一次创建对象时给的值,之后this调用的也是
    }
}
class Person03{
    String name;
    int age;

    public Person03(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person03(){

    }

    public boolean compareTo(Person03 p){//整型变量等数字类型变量使用==比较,字符串之间的比较使用equals
        if (this.name.equals(p.name) && (this.age == p.age)){//当前对象的名字this.name和传入的对象的名字比较
            return true;
        }else {
            return false;
        }
    }
}