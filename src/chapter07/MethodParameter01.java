package chapter07;

/*
成员方法的传参机制
 */
public class MethodParameter01 {
    public static void main(String[] args) {
        AAP aap = new AAP();
        int a = 10;
        int b = 20;
        aap.swap(a,b);//调用swap
        System.out.println("a="+a+"b="+b);
        //由于局部变量和全局变量的不同,所以即使修改了其中局部变量的值
        //使得局部变量总的数据交换也不会影响到全局变量的值
    }
}

class AAP{
    //此方法完成了数的交换
    public void swap(int a,int b){
        System.out.println("\na和b交换前的值\na="+a+"\tb="+b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na和b交换后的值\na="+a+"\tb="+b);
    }

}
