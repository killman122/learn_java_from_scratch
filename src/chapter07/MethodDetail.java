package chapter07;

import chapter06.ArrayExercise01;

public class MethodDetail {
    public static void main(String[] args) {
        AA aa = new AA();
        int arr[] ;
        arr = aa.getSumAndSub(1,2);
        System.out.println("函数返回多个返回值按照数组的形式的和为"+arr[0]);
        System.out.println("函数返回多个返回值按照数组的形式的差为"+arr[1]);
    }
}

class AA{
    public int[] getSumAndSub(int n1,int n2){
        int[] res = new int[2];//创建一个数组并开辟空间,只是这个数组是一个没有传入数值的数组
        res[0] = n1+n2;
        res[1] = n1-n2;
        return res;
    }
}