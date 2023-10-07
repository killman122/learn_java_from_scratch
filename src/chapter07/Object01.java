package chapter07;

/*
类与对象问题的衍生
张老太养了两只猫,一只名字叫做小白,今年三岁,白色.还有一只叫做小花
今年100岁,花色
编写一个程序,当用户输入小猫的名字是,就显示该猫的名字,年龄,颜色
如果用户输入的小猫名字有误,则显示张老太没有这只猫
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Object01 {
    public static void main(String[] args) {
        //单独使用变量来解决 ==>>不利于数据的管理(将一只猫的信息拆开放在不同的变量中)
        /*
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";
        String cat2Name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";
        System.out.println("请输入一个小猫的名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        switch (name){
            case "小白":
                System.out.println("查询到的猫的名字叫做"+cat1Name+"猫的年龄"+cat1Age+
                        "猫身上的花色是"+cat1Color);
                break;
            case "小花":
                System.out.println("查询到的猫的名字叫做"+cat2Name+"猫的年龄"+cat2Age+
                        "猫身上的花色是"+cat2Color);
                break;
            default:
                System.out.println("你输入的猫的名称有误,这里没有那只猫");
        }
        //使用数组存储同一只猫猫的相关信息,这里存储的是每一只猫的名称,年龄,花色
        //但是这种方法无法体现出数据类型,只能通过[下标]获取信息,造成内容不明确
        //不能体现出猫的行为
        String[] cat1 = {"小白","3","白色"};
        String[] cat2 = {"小花","100","花色"};
         */
        //使用oop 的思想,实例化一只猫/创建一只猫对象
        Cat cat = new Cat();
        //new (cat)创建一只猫,将创建的猫赋值给Cat cat,其中cat就是一个对象
        cat.name = "小白";
        cat.age = 3;
        cat.color = "白色";
        //为一个对象添加不在类中的对应属性,还是需要在类中对齐的属性进行声明但是不需要赋值
        cat.weight= 10;

        //创建了第二只猫,赋值给cat2
        //其中cat2也是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小花";
        cat1.age = 100;
        cat1.color = "花色";
        cat1.weight = 20;
        //如何使用,访问对象中的属性
        System.out.println("第一只猫的信息"+cat.name+" "+cat.age+" "+cat.color+" "+cat.weight);//中间使用空格隔开,将所有的属性列举出
        System.out.println("第二只猫的信息"+cat1.name+" "+cat1.age+" "+cat1.color+" "+ cat1.weight);//中间使用空格隔开,将所有的属性列举出
    }
}

//使用面向对象的方式解决养猫问题
//定义一个猫类 Cat -> 自定义的数据类型
class  Cat{
    //根据题目要求,先将对应的属性写出
    //在猫的问题中属性是:猫的颜色,猫的年龄,猫的名字
    String name;//名字
    int age;//年龄
    String color;// 颜色
    double weight;
}
