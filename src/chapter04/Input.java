package chapter04;
import java.util.*;//表示即将java.util下的所有的类导入


public class Input {
    //演示接收用户的输入
    public static void main(String[] args) {
        //在Java中从键盘输入语句使用的是Scanner扫描器(对象)
        //步骤:导入该类所在的包,java.util.*
        //创建该类对象(声明变量)
        //调用其中的功能,在这里输入 new Scanner(System.in).var 直接回车自动填充
        //new创建一个对象,就是Scanner类的一个对象,通过Scanner对象中的.next()方法的使用,获得用户的输入
        Scanner scanner = new Scanner(System.in);
        //接收用户的输入,使用了相关的方法
        System.out.println("请输入名字");
        //当程序执行到next()方法时会等待用户输入
        String name = scanner.next();//接收用户的输入
        System.out.println("请输入年龄");
        int age = Integer.parseInt(scanner.next());//接收用户的输入
        //int age = sacnner.nextInt();//这里使用一个整型变量接收用户输入的年龄
        System.out.println("请输入薪水");
        double sal = scanner.nextDouble();//接收用户的输入
        System.out.println("人的信息如下:");
        System.out.println("name="+name+"age="+age+"salary="+sal);
    }
}
