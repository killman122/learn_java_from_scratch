package chapter06;

public class TwoDimensionalArray02 {
    public static void main(String[] args) {

        //第一种方式动态产生二维数组
        int[][] arr = new int[2][3];
        arr[1][1] = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//换行,如果使用System.out.print()不能换行
        }

        //第二种方式动态产生二维数组
        int[][] arr1;
        arr1 = new int[2][3];

    }
}
