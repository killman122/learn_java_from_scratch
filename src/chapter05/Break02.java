package chapter05;

/*
1-100以内的数求和,求出当和第一次大于20的当前数 [for+break]
 */

import java.util.Scanner;

public class Break02 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i < 100; i++) {
            sum+=i;
            if (sum>20){
                System.out.println(i);
                System.out.println("当前的和的数据值是"+sum);
                break;
            }
        }

        DingZhen dingZhen = new DingZhen();
        dingZhen.dingzheng();
    }
}

class DingZhen{
    void dingzheng(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=3; i++) {
            System.out.println("请输入登录的用户名");
            String name = scanner.next();
            System.out.println("请输入登录的密码");
            int password = scanner.nextInt();
            /*
            在上述代码中，使用了字符串比较操作符 "==" 来比较用户名。
            但是，使用 "==" 比较字符串时，它实际上会比较两个字符串的引用地址，
            而不是比较它们的内容，这可能会导致意外的结果。
             */

            if (name.equals("丁真") && password==666){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("还有"+(3-i)+"次机会");
            }
        }
    }
}
