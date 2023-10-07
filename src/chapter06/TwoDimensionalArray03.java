package chapter06;

import java.util.ArrayList;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        /*
        动态创建下面的二维数组,并打印输出
        i=0:1
        i=1:2  2
        i=2:3  3    3
        一共有三个一维数组,每个一维数组的元素不一样
         */
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {//遍历arr每一个一维数组
            //给每个一维数组开辟空间
            //如果没有给一维数组new,那么arr[i]为null
            arr[i] = new int[i+1];
            //遍历一维数组,并给一维数组的每个元素赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i+1;
            }
        }

        //遍历输出arr中的元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//换行

        }
    }
}
