package chapter06;

/*
二维数组的快速入门
使用二维数组输出如下图形
0 0 0 0 0 0
0 0 1 0 0 0
0 2 0 3 0 0
0 0 0 0 0 0
 */

public class TwoDimensionalArray01 {//两个维度的数组
    public static void main(String[] args) {
        //什么是二维数组,从定义形式上看 int[][],原来的一维数组的每个元素是一维数组
        //关于二维数组的关键概念


        int[][] arr ={{0,0,0,0,0,0},
                {0,0,1,0,0,0},
                {0,2,0,3,0,0},
                {0,0,0,0,0,0}};
        //统计二维数组中的一维数组的元素个数
        System.out.println("二维数组的元素个数="+arr.length);
        //二维数组的每个元素是一维数组,所以如果需要得到每个一维数组的值,还需要再次遍历
        //如果要访问第(i+1)个一维数组的第(j+1)个值 需要使用arr[i][j];

        //输出二维数组的图形,使用arr.length得到一维数组的个数
        for (int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
            //遍历二维数组的每个元素,将每个元素遍历
            //arr[i]
            for (int j = 0; j < arr[i].length; j++) {//遍历每个二维数组中的元素,在对应每个元素不同的长度
                //得到对应的二维数组每一个一维数组的长度
                System.out.print(arr[i][j]+"\t");//使用print将内容输出到一行
            }
            System.out.println();//换行
        }
        System.out.println("按理说这里输出的是3\t"+arr[2][3]);
    }
}
