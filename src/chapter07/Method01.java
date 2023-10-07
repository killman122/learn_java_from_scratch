package chapter07;

/*
创建一个人的类其中包含了许多的属性和一些方法比如说话等
添加speak成员方法,输出 我是一个好人
添加cal01 成员方法,可以计算从1+..+100的结果
添加cal02 成员方法,该方法可以接收一个数n,计算从1+..+n的结果
添加getSum成员方法,可以计算两个数的和
 */

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
    //方法使用,方法写好后不调用,不会输出
    //先创建对象,之后就可以调用对象中的方法
        Person person = new Person();
        person.speak();//调用方法
        person.cal01();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要加后的最后一个数字");
        int shu = scanner.nextInt();
        person.cal02(shu);
        System.out.println("输入要求和的两个数字");
        double shu1= scanner.nextDouble();
        double shu2= scanner.nextDouble();
        //调用getSum方法同时给num1 = 10,num2 = 20;
        //将方法getSum返回的值,赋值给变量returnSum
        double returnSum = person.getSum(shu1,shu2);
        System.out.println("getSum方法返回的值 = "+returnSum);
    }
}

class Person{
    String name;
    int age;
    //public表示方法是公开,void表示没有返回值,speak表示方法名
    //()叫做形参列表,{}方法体可以写要执行的代码
    public void speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int sum = 0;
        for (int i = 1; i <=1000 ; i++) {
            sum+=i;
        }
        System.out.println("计算后的1+..1000的结果是"+sum);
    }
    //添加cal02 成员方法,该方法可以接收一个数n,计算从1+..+n的结果
    public void cal02(int end){
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum+=i;
        }
        System.out.println("结果为"+sum);
    }
    //添加getSum成员方法,可以计算两个数的和,两个形参可以接收用户输入的两个数
    //return sum; 表示将sum的值返回
    public double getSum(double a,double b){
        double sum = a+b;
//        System.out.println("这两个数的和是"+sum);
        return sum;
    }
}
