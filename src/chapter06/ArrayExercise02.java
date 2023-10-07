package chapter06;
/*
数组的应用案例2
请求出一个数组int[]的最大值{4,-1,9,10,23},并输出对应的下标
 */

public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] arr={4,-1,9,10,23};
        int max =0;
        int index = 0;
        for (int i = 0; i <arr.length; i++) {
            if (max<=arr[i]){
                max=arr[i];
                index = i;
            }
        }
        System.out.println("数组中最大的元素的下标是"+index+"最大元素的值为"+max);

    }
}
