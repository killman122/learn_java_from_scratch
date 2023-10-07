package chapter05;

//if的快速入门

import chapter04.Input;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        //思路分析:接收输入的年龄
        System.out.println("请输入人的年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>18){
            System.out.println("你的年龄大于18岁,你要对自己的行为负责,送入监狱");
        }
        System.out.println("程序继续..");
    }
}
