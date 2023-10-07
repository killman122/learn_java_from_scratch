package chapter08;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        A02 a02 = new A02();
        String arr[] = {"nb","hello","wangdao"};
        System.out.println("输入你要查找的字符串");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int res = a02.find(arr,next);
        System.out.println("输出的返回值int类型为"+res);
    }
}

class A02{
    public int find(String arr[],String a){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(a)){
                return i;
            }
        }
        return -1;
    }
}