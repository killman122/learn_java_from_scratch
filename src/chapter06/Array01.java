package chapter06;

public class Array01 {
    public static void main(String[] args) {
        double[] hens ={3,5,1,3.4,2,50};//表示数组中的元素{3,5,1,3.4,2,50}
        /*
        通过数组的下标访问数组中的元素从下标为0开始
         */
        //遍历数组得到数组的所有的元素的和
        //通过for循环循环访问出数组的元素/值
        double totalWeight = 0;
        for (int i = 0; i < 6; i++) {
//            System.out.println("第"+(i+1)+"个元素的值"+hens[i]);
            totalWeight+=hens[i];
        }
        System.out.println("总体重="+totalWeight+"平均体重"+totalWeight/6);
    }
}
