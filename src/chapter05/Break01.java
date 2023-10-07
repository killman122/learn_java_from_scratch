package chapter05;

/**
 * break 快速入门
 */

public class Break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==3){
//                break;
                continue;
            }
            System.out.println("ok"+i);
        }
    }
}


/*
break语句出现在很多层嵌套的语句块中时,可以通过标签指明要终止的是哪一层的语句块
标签的基本使用
    label1:{......
    label2:     {.....
    label3:            { .....
                         break label2;
                         .....
                       }
                 }
           }
break 语句可以指定退出哪层
label1是标签,由写者指定
break后指定到哪个label就退出到哪里
在实际开发中,尽量不使用标签
如果没有写标签默认退出最近的循环体

label标签取什么名字由写者决定

 */