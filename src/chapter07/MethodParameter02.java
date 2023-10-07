package chapter07;

import java.awt.*;

/*
成员方法有关于引用数据类型也就是数组,接口,类等类型的传参机制
在引用数据类型中随着调用,如果将函数也就是局部变量中传入的数组进行修改,那么也会影响到全局的数组,也就是main中传出到局部函数中的数组
 引用类型传递的是地址(传递的值是地址)可以通过形参影响实参
在对象的传递中,也是引用类型传递,传递的是一个地址
 */
public class MethodParameter02 {
    public static void main(String[] args) {
        //测试
        BB bb = new BB();
        int[] arr = {1,2,3};
        bb.test100(arr);//调用方法
        System.out.println("这是main中的arr数组输出");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        //测试
        Person1 person1 = new Person1();//在这里创建了一个person对象
        person1.name = "wangdao";
        person1.age = 20;
        bb.test200(person1);
        System.out.println("main的p.age="+ person1.age);
        System.out.println("main的p.name="+ person1.name);
        //测试题:如果test200中的person = null,那么这个p的数据值在main中是什么,答案还是null
    }
}
class Person1{
    String name;
    int age;
}
class BB{//在B类中编写一个方法test100,可以接收一个数组,在方法总修改该数组,观察原来的数组是否变化
    public void test100(int[] arr){
        arr[0] = 100;
        //遍历数组
        System.out.println("这是test100的arr数组的输出");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    public void test200(Person1 person1){
        //person1.age=200002;
        person1=null;//这里指的是将局部变量也就是这个函数中的person1指向的地址置为空,不是将main中的person1置为空
        person1 = new Person1();//在这里又产生了一个person对象
        person1.name = "tom";
        person1.age = 19;
    }

}
