package chapter05;

// 判断一个三位数是否是水仙花数
// 水仙花数指的是一个三位数,其各个位置上的数字的立方和等于其本身
// 例如:153 = 1*1*1 + 3*3*3 + 5*5*5

import java.util.Scanner;

public class HomWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degital = scanner.nextInt();
        int bai = degital/100;
        int shi = degital%100/10;
        int ge = degital%10;
        if(bai*bai*bai+shi*shi*shi+ge*ge*ge==degital){
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }
    }
}
