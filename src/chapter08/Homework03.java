package chapter08;

public class Homework03 {
    public static void main(String[] args) {
        //测试
        Book book = new Book("笑傲江湖",666);
        book.info();
        book.updatePrice();//更新价格后
        book.info();
    }
}

class Book{
    /*
    编写类Book,定义方法updatePrice,实现更改某本书的价格,具体:
    如果价格>150,则更改为150,如果价格>100,则更改为100,否则不变
     */
    /*
    分析:
    1.类名    Book
    2.属性    price, name
    3.方法名 updatePrice
    4.形参为空
    5.返回值 void
    6.提供一个构造器
     */
    String name;
    double price;

    public Book(String name, double price) {//注意构造器不指定返回值的类型
        this.name = name;
        this.price = price;
    }

    //直接通过this对象的使用来判断是否更新价格,价格更新多少
    public void updatePrice(){
        //如果在方法中,没有price局部变量创建,或者形参中没有传入同名的变量,那么this.price等价于price
        //如果有局部变量,那么带this的相当于对象的属性,不带this的是局部变量
        if (this.price > 150){
            this.price = 150;
        }else if (this.price > 100 && this.price<=150){
            this.price = 100;
        }
    }

    //显示数据的情况
    public void info(){
        System.out.println("书名=" + this.name + " 价格=" + this.price);
    }
}