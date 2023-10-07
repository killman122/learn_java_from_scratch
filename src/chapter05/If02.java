package chapter05;

import java.util.Scanner;

/**
 *编写一个程序,可以输入人的年龄,如果该同志的年龄大于18岁,则输出"你的年龄大于18岁,要对自己的行为负责,送入监狱"
 * 否则,输出"你的年龄不大这次放过你了"
 */

/**
 * 双分支的使用if-else
 */

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的年龄");
        int age = scanner.nextInt();
        if (age>18){
            System.out.println("你的年龄大于18岁,要对自己的行为负责,送入监狱");
        }else {
            System.out.println("你的年龄不大这次放过你了");
        }
    }
}
