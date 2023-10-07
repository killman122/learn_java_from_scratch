package chapter08;

public class VarParameters {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        hspMethod.sum();
        hspMethod.sum(1,2,3,5,4);
    }
}

class HspMethod{
    //可以计算出两个数的和,三个数的和,4,5...
    //可以使用方法重载
    //使用可变参数优化
    //int...表示接收的是可变参数,类型是int,即可以接受多个(0-多)
    //使用可变参数时 ,可以当作数组来使用,即nums 可以当作数组填入,但是不需要加[]
    //遍历nums值求和即可
    public double sum(int... nums){
        System.out.println("接受的参数个数是="+nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            res += nums[i];
        }
        System.out.println("所有的可变参数的和是"+res);
        return res;
    }
}