package chapter05;

import java.util.Scanner;

/**
 * 编写一个程序,程序可以接收一个字符,比如a,b,c,d,e,f,g
 * a 表示星期一,b表示星期二..
 * 根据用户输入显示相依的信息,要求使用switch语句完成
 */

/**
 * 思路分析
 * 接收一个字符,创建Scanner对象
 * 使用switch完成匹配,并输出对应的信息
 */

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符选择对应的日期,字符从a-g");
        char zi = scanner.next().charAt(0);//接收到的是一个字符串但是将字符串转换称为字符,取出字符串的第一个字符
        //在Java中只要有值返回,就是一个表达式
        switch (zi){
            case 'a':
                System.out.println("今天是星期一,猴子穿新衣");
                break;
            case 'b':
                System.out.println("今天是星期二,猴子当小二");
                break;
            case 'c':
                System.out.println("今天是星期三,猴子爬雪山");
                break;
            default:
                System.out.println("你输入的字符不正确,匹配不上");
        }
        System.out.println("退出了switch,继续执行程序");
    }
}
