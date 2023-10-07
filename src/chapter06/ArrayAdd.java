package chapter06;
/*
实动态的给数组添加元素效果,实现对数组的扩容
原始数组使用静态分配 int[] arr = {1,2,3}
增加的元素,直接放在数组的最后 arr = {1,2,3,4} arrNew = {1,2,3,4}
用户可以通过如下方法来决定是否继续添加元素,添加成功,是否继续? y/n

思路定义
定义初始数组 int[] arr = {1,2,3}
定义一个新的数组 int[] arrNew = new int[arr.length+1];
遍历arr数组,依次将arr的元素拷贝到arrNew数组
将4赋给arrNew[arrNew.length-1]=4,将4赋值给arrNew的最后一个元素
让arr指向arrNew数组,使用引用传递/地址传递,那么原来地址的arr数组就没法引用称为垃圾被销毁


课后练习题:ArrayReduce
有一个数组{1,2,3,4,5},可以将该数组进行缩减,提示用户是否继续缩减,
每次缩减随后哪个元素,当只剩下最后一个元素,提示不能在缩减
 */

public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("现在显示的是数组中的下标"+i+"的数组元素"+arr[i]);
        }

       int[] arrNew = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i]= arr[i];
        }
        arrNew[arrNew.length-1]=4;
        arr=arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("现在显示的是数组中的下标"+i+"的数组元素"+arr[i]);
        }
        System.out.println(arr);
    }
}
