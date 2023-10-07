package chapter06;

/**
 * 编写代码实现数组拷贝(内容复制),不是之前的直接传递地址
 * 将 int[]arr1 = {10,20,30};拷贝到arr2数组
 */

public class ArrayCopy {
    public static void main(String[] args) {
        //将int[] arr1 = {10,20,30};拷贝到arr2数组,要求数据空间之间相互独立
        //在改变一个数组之中的元素后,不会改变另一个数组中的元素
        int[] arr1 = {10,20,30};
        //先创建一个新的数组arr2,开辟新的数据空间
        int[] arr2 = new int[arr1.length];
        //在对一个声明的数组使用new 数据类型[长度];的方式相当于为这个数组已经开辟了一个新的空间
        //遍历arr1将每个元素复制给新创建的数组arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("循环遍历数组输出数组中的每一个元素"+arr2[i]);
        }
    }
}
