public class 变量学习 {
    public static void main(String[] args) {
        int a=1;//定义了一个变量,变量类型是整型,名称a,值1
        int b=1;//定义了一个变量,类型是int整型,名称b,值为3
        b=89;//讲89赋值给b变量
        System.out.println(a);//输出变量a的值
        System.out.println(b);//输出变量b的值
    }

}


/*
* int age =20;整型变量
* double score = 88.8;双精度浮点型数据;
* char gender = '男'; 使用字符男标识性别;
* String name = "king"; java中的字符串使用双引号引起,其中单个字符使用单引号引起'';
*
* 变量表示内存中的一个存储区域,类型不同所占用的字节也是不同的
* 由于数据类型不一样,所产生的数据的空间大小也是不同的int 4字节 double是8字节
* 在Java中使用变量时,必须要变量先声明在使用
* 该区域中的数据/在区域中是不断变化     例如在使用int类型定义一个变量,但是在后面的使用中将数据类型赋值为char会产生报错
* 变量在同一个作用域中不能同名        例如:int a = 88;  int a = 99;错误
* 变量 = 变量名+值+数据类型
* */