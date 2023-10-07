package chapter06;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //演示    数据类型    数组名[] = new 数据类型[大小]
        //循环输入5个成绩,保存到double数组,并输出
        //创建一个double数组,长度为5个
        double[] scores = new double[5];
        double score[] = new double[5];
        //循环输入 scores.length表示数组的大小或者是长度
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素的值");
            score[i] = scanner.nextDouble();
        }
        //输出,再次遍历数组
        for (int i = 0; i < score.length; i++) {
            System.out.println("数组中第"+(i+1)+"个元素的值是"+score[i]);
        }
    }
}
