package chapter08;

public class VarParameterDetail {
    public static void main(String[] args) {
        //细节:可变参数的实参可以为数组
        int[] arr = {1,2,3};
        TT tt = new TT();
        tt.f1(arr);
    }
}

class TT{
    public void f1(int... nums){
        System.out.println("可变数组的长度是"+nums.length);
    }
    //可变参数可以和普通类型的参数一起放在形参列表,但是必须保证可变参数在最后(这里和python中的可变参数和可以调节位置的参数一致)
    public void f2(String str,double... nums){

    }
    //下面的是一个错误的用法,可变参数的必须在后面并且在一个函数的所有参数中只能有一个是可变参数
    //public void f3(double... num, int... nums)
}
