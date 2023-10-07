package chapter08;

//TODO  注意迷宫问题可以应用于小车探索
public class MiGong {
    public static void main(String[] args) {
        //思路
        //先创建迷宫,使用二维数组表示 int[][] map = new int[8][7];
        //先规定 map 数组的元素值 :0表示可以走  1 表示障碍物
        int[][] map = new int[8][7];
        //将最上面的一行和最下面的一行,全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将最右面的一行和最左面的一行,全部设置为1
        for (int i = 0; i < 7; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;//设置障碍物
        map[3][2] = 1;
        map[2][2] = 1;
        //TODO 注意这个地图是一个八行七列的二维列表组成的
        //输出当前的地图
        System.out.println("====当前的地图情况====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();//仅作与换行的作用别无他用
        }

        //使用findWay寻路
        TS ts = new TS();
//        ts.findWay(map,1,1);
        DrawRoad drawRoad = null;
        drawRoad = new DrawRoad();
//        drawRoad.drawRoad(map);
        ts.findWay2(map, 1, 1, drawRoad);
//        System.out.println("\n====找路的情况如下====");
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(map[i][j]+" ");
//            }
//            System.out.println();//仅作与换行的作用别无他用
//        }

    }
}

class TS{
    //使用递归回溯的思想解决老鼠出迷宫的问题
    //findWay方法专门用来找出迷宫的路径
    //如果找到就返回true,否则返回false
    //map 指的就是二维数组,即表示迷宫
    //i,j参数代表着老鼠的位置,初始化的位置为(1,1)
    //因为是递归寻找路径,所以需要规定map数组中的各个值的含义
    //先规定 map 数组的元素值 :0表示可以走  1 表示障碍物   2 表示可以走的路,且走过   3 表示走过,但是走不通的死路
    //当map[6][5]等于2 说明找到通路(可以退出,结束查找),否则继续寻找
    //不同的寻路策略,对应的寻路结果也不相同
    //先确定老鼠找路的策略 下->右->上->左(在小车探索中应该就是A*算法所确定的寻找策略)
    public boolean findWay(int[][] map,int i,int j){
        if (map[6][5] == 2){//说明已经寻找到路径
            return true;
        }else {
            if (map[i][j]==0){//说明可以走,但是还没有走
                //假定当前道路可以走通
                map[i][j] = 2;
                //使用找路策略,确定该位置是否真的可以走通
                //下->右->上->左
                if (findWay(map,i+1,j)){//先尝试寻找此路可以走通,向下走判定
                    return true;
                }else if (findWay(map, i, j+1)){//如果向下走,走不通,向右走判定
                    return true;
                }else if (findWay(map, i-1, j)){//如果向下走,向右走都走不通,那么尝试向上走
                    return true;
                } else if (findWay(map, i, j-1)) {//到这里时向下走,向右走,向上走都走不通,所以开始尝试向左走
                    return true;
                }
                else {//说明假定的寻路无法走通
                    map[i][j] = 3;
                    return false;
                }
            }else {// map[i][j] = 1,2,3 表示当前路障碍物/可以走的路/走过但是不通的死路
                return false;
            }
        }
    }
    //修改找路的策略,观察最终的路径是否发生变化
    public boolean findWay2(int[][] map, int i, int j, DrawRoad drawRoad){
        if (map[6][5] == 2){//说明已经寻找到路径
            System.out.println("\n====找路的情况如下====");
            drawRoad.drawRoad(map);
            return true;
        }else {
            if (map[i][j]==0){//说明可以走,但是还没有走
                //假定当前道路可以走通
                map[i][j] = 2;
                //使用找路策略,确定该位置是否真的可以走通
                // 上->右->下->左
                if (findWay2(map,i-1,j, drawRoad)){//先尝试寻找此路可以走通,向下走判定
                    return true;
                }else if (findWay2(map, i, j+1, drawRoad)){//如果向下走,走不通,向右走判定
                    return true;
                }else if (findWay2(map, i+1, j, drawRoad)){//如果向下走,向右走都走不通,那么尝试向上走
                    return true;
                } else if (findWay2(map, i, j-1, drawRoad)) {//到这里时向下走,向右走,向上走都走不通,所以开始尝试向左走
                    return true;
                }
                else {//说明假定的寻路无法走通
                    map[i][j] = 3;
                    return false;
                }
            }else {// map[i][j] = 1,2,3 表示当前路障碍物/可以走的路/走过但是不通的死路
                System.out.println("\n====找路的情况如下====");
                drawRoad.drawRoad(map);
                return false;
            }
        }
    }
}

class DrawRoad{
    public void drawRoad(int [][]map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();//仅作与换行的作用别无他用
        }
    }
}
