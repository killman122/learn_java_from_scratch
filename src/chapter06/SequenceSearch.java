package chapter06;

import java.util.Objects;
import java.util.Scanner;

public class SequenceSearch {
    public static void main(String[] args) {
        /*
        有一个数列:白眉鹰王,金毛狮王,紫衫龙王,青翼蝠王猜数游戏:
        从键盘中任意输入一个名称,判断数列中是否包含此名称[顺序查找]
        要求:如果找到了,提示找到并给出下标
         */
        //思路分析:先定义一个字符串数组
        //接收用户输入,遍历数组的顺序,按照原有的顺序,依次判断,是否查找到
        String[] arr = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的人名");
        String name = scanner.next();
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(name, arr[i])){
                System.out.println("找到了这个"+name+"人物,人物在第"+(i+1)+"个位置");
                break;
            }else{
                System.out.println("没有找到你说的这个人物"+name);
            }
            System.out.println("现在显示的是数组中的第"+(i+1)+"个人物,人物名称叫"+arr[i]);
        }
    }
}
