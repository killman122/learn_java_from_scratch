package chapter08;

public class Homework04 {
    public static void main(String[] args) {
        /*
        实现数组的赋值功能copyArr,输入旧数组,返回一个新数组,
        元素和旧数组一样
         */
        int[] oldArr = {10,23,34};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        //遍历新数组newArr
        System.out.println("返回新数组newArr元素的所有");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+"\t");
        }
    }
}
class A03{
    public int[] copyArr(int[] oldArr){
        //在堆中开辟新的空间,空间的大小和旧的大小一样
        int[] newArr = new int[oldArr.length];
        //遍历 oldArr,将元素拷贝到newArr
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}

