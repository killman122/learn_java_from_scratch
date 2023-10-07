package chapter04;

/**
 * 演示逻辑运算符的使用
 */

public class LogicOperator01 {
    public static void main(String[] args) {
        // && 和 & 案例使用
        int age = 50;
        if (age>20 && age <90){//True
            System.out.println("ok100");
        }
        if (age>20 && age <30){// True  False
            System.out.println("ok200");
        }
        if (age>20 & age <30){// True  False
            System.out.println("ok200");
        }
        if (age>20 & age <90){// True  False
            System.out.println("ok300");
        }
    }
}
