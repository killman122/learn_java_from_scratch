package chapter06;

import java.util.Scanner;

public class ArrayExercise01 {
    public static void main(String[] args) {
        /*
        创建一个char类型的26个元素的数组,分别放置'A'-'Z'
        使用for循环访问所有的元素并打印出来
        char类型的数据运算'A'+1='B'
        使用chatAt()获得字符串指定下标index的字符
         */
        char[] alpha = new char[26];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个元素,后续元素将自动补充完成到26个字母");
        alpha[0]=scanner.next().charAt(0);
        for (int i = 1; i <= alpha.length-1; i++) {
            alpha[i]= (char) (alpha[i-1]+1);//需要强制转换将加后的整型转换为char
        }
        for (int i = 0; i < alpha.length; i++) {
            System.out.println("数组中第"+(i+1)+"个元素的数据值是"+alpha[i]);
        }
    }
}
