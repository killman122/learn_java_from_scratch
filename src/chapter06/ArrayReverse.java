package chapter06;
/*
要求:对数组中的元素进行反转
arr {11,22,33,44,55,66} ==>> {66,55,44,33,22,11}
 */

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55,66};
        int[] arr2 = new int[arr1.length];
        for (int i = arr1.length-1; i >=0; i--) {
//            System.out.println("数组中的元素值"+arr1[i]);
            arr2[arr1.length-i-1]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
