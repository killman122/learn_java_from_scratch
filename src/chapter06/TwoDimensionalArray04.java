package chapter06;

public class TwoDimensionalArray04 {
    //int arr[][]={{4,6},{1,4,5,7},{-2}};遍历该数组,并得到和
    public static void main(String[] args) {
        int arr[][]={{4,6},{1,4,5,7},{-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
                sum+=arr[i][j];
            }
            System.out.println();//换行
            System.out.println("所有的和的结果是"+sum);
        }
    }
}
