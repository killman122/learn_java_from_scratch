package chapter05;

/*
使用switch把小写类型的char型转换为大写(键盘输入),只转换a,b,c,d,e,
其他的输出"other"

对学生的成绩大于60分,输出"合格",低于60分的,输出"不合格"
(输入的成绩不能大于100),提示 成绩 /60

根据用于指定的月份,打印该月份所属的季节,3,4,5春季,6,7,8夏季 9,10,11秋季
12,1,2冬季

 */

import java.util.Scanner;
public class Switch02 {
    public static void main(String[] args) {
//        Convert_Case.convert_case();
//        Grade_Judgment.grade_judgment();
        Season_By_Month.season_by_month();
    }
}
class Convert_Case{
    static void convert_case(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("亲输入要转换的字符");
        char word = scanner.next().charAt(0);
        switch (word){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }

    }
}
class Grade_Judgment{
    /*
    思路分析:
    这里需要做一个转换:
        如果成绩在[60,100],(int)(成绩/60) = 1
        如果成绩小于60,int(成绩/60) = 0
     */
    static void grade_judgment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要判断的成绩:");
        double score = scanner.nextDouble();
        //使用if-else 保证数据的输入是有效的0-100
        if (score >= 0 && score<=100){
            switch ((int)(score/60)){
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格");
                    break;
                default:
                    System.out.println("输入的数据不对");
            }
        }else {
            System.out.println("输入有误,请检查后重新输入");
        }

    }
}

class Season_By_Month{
    static void season_by_month(){
        //输入月份匹配季节
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你想要查询的月份:");
        int month = scanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输的的月份不对,月份的限制在1-12之内");
        }
    }
}