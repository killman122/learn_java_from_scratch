package chapter07;
/*
遍历一个二维数组,输出二维数组的各个元素值
 */

public class Method02 {
    public static void main(String[] args) {
        int [][] map ={{0,0,1},{1,1,1},{1,1,3}};
//        //遍历一个二维数组需要双重循环嵌套的方式
//        for (int i = 0; i < map.length; i++) {//外层循环遍历行
//            for (int j = 0; j < map[i].length; j++) {//内层循环遍历列
//                System.out.print(map[i][j]+"\t");//这里使用\t转义字符为的是将字符之间留出一些空余的位置
//            }
//            System.out.println();//这里使用一个空的输出相当于换行
//        }
        //使用方法
        MyTool myTool = new MyTool();
        myTool.print(map);
    }
}

//把输出的功能写到一个类的方法中
class MyTool{
    //方法接收一个二维数组
    public void print(int[][] map){
        //对传入的二维数组进行输出
        //遍历一个二维数组需要双重循环嵌套的方式
        for (int i = 0; i < map.length; i++) {//外层循环遍历行
            for (int j = 0; j < map[i].length; j++) {//内层循环遍历列
                System.out.print(map[i][j]+"\t");//这里使用\t转义字符为的是将字符之间留出一些空余的位置
            }
            System.out.println();//这里使用一个空的输出相当于换行
        }
    }
}