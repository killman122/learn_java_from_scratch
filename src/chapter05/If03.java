package chapter05;

import java.util.Scanner;

/**
 * 多分支
 * if-else if -else
 */

public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入保国同志的芝麻信用分");
        double v = scanner.nextDouble();
        if (v>=1 && v<=100){
            if (v==100){
                System.out.println("信用极好");
            } else if (80<v && v<=99) {//在python程序中能够将&&左右两侧的直接连接不需要使用&&连接
                System.out.println("信用优秀");
            } else if (60<=v && v<=80) {
                System.out.println("信用一般");
            }else {
                System.out.println("信用不及格");
            }
        }else {
            System.out.println("信用分数需要在1-100以内,请重新输入");
        }
    }
}
