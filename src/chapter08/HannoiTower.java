package chapter08;

import javax.swing.*;

public class HannoiTower {
    public static void main(String[] args) {
        /*
        汉诺塔问题求解
         */
        Tower tower = new Tower();
        tower.move(3,'A','B','C');
    }
}
class Tower{
    //num表示柱子上要移动的盘的数目,a,b,c分别表示A塔B塔C塔
    public void move(int num,char a,char b,char c){
        //如果num只有一个盘 num =1;
        if (num == 1){
            System.out.println(a+"->"+c);
        }else {
            //如果有多个盘,可以看成两个,最下面的和上面的所有的盘
            //移动上面所有的盘到b,借助c
            move(num-1,a,c,b);
            //把最下面的这个盘移动到c
            System.out.println(a+"->"+c);
            //把b塔上的所有的盘移动到c,借助a
            move(num-1,b,a,c);
        }
    }
}
