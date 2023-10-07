package chapter06;

public class BubbleSort {
    public static void main(String[] args) {
        /*
        数组 [24,69,80,57,13]
        第一轮排序:目标把最大的数放在最后
        第一次比较[24,69,57,80,13]
        第二次比较[24,69,57,13,80]
        第三次比较[24,57,69,13,80]
        第四次比较[24,57,13,69,80]
        第四次比较[24,57,13,69,80]
         */
        int[] arr = {24,69,80,57,13,-2,200,66,666,888,8};
        int temp = 0;//用于辅助的一个变量
        //将多轮排序使用外层循环包起
        //先死后活 4常量值就是数组的长度arr.length-1
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {//4次比较
                //如果前面的数大于后面的数就交换
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n==第"+(i+1)+"轮==");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+"\t");
            }
        }
    }
}
