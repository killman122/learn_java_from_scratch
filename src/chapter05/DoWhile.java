package chapter05;

public class DoWhile {
    public static void main(String[] args) {
        //输出10句 你好,韩顺平教育
        int i = 1;//循环
        do{
            System.out.println("你好,韩顺平教育"+i);
            i++;
        }while (i<=10);
        System.out.println("退出 do..while 继续执行");
    }
}

/**
 * 使用(int)强制类型转换为整型变量
 * Math.random() 使用随机数的方法获取[0-1)之间的小数值,但是在乘积上100后转换为0-100之间的整数
 * 由于数的区间不是一个闭合的区间,所以使用后面的方法中加1,将数据变为0-100
 */