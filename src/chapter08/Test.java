package chapter08;

public class Test {
    int count = 9;//属性
    public void count1(){
        //Test类对象的成员方法
        count = 10;//这个count虽然没有拿this指向,但是只有这个变量,也就是上面创建的属性
        System.out.println("count1=" + count);
    }
    public void count2(){
        //Test类中的成员方法
        System.out.println("count2"+ count++);
    }

    public static void main(String[] args) {
        //虽然分配了空间作为初始化,但是没有使用另一个变量引用在开辟的对炸中
        //所以new Test()叫做匿名对象,对象也是在堆栈中,但是只能使用一次,由于没有对象的引用传递
        //没有名字的对象叫做匿名对象,由于匿名对象只有一次的指向,在使用后就销毁在空间中的内存
        //new Test().count1();创建匿名对象后,就调用count1成员方法
        new Test().count1();
        Test test = new Test();
        test.count2();
        test.count2();
    }
}
