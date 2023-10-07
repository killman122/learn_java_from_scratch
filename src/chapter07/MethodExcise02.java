package chapter07;

/*
编写一个MyTool类,编写一个方法可以打印二维数组的数据
编写一个方法copyPerson,可以复制一个Person对象,返回复制的对象.克隆对象
注意要求得到的新对象和原来的对象是两个独立的对象,但是他们的属性相同
 */

public class MethodExcise02 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.name = "milan";
        p.age = 100;
        MyTools myTools = new MyTools();
        myTools.copyPerson(p);
        Person2 p2 = myTools.copyPerson(p);
        //到此p和p2是两个独立的对象,都是person对象,但是是两个独立的对象,但是属性相同
        System.out.println("p的属性 age="+p.age+"p的名字 name="+p.name);
        System.out.println("p2的属性 age="+p2.age+"p2的名字 name="+p2.name);
        //可以通过对象比较查看是否是同一个对象
        //可以通过输出对象的hashcode观察对象是否是同一个对象
        System.out.println(p == p2);
    }
}

class MyTools{
    public void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();//这里用作换行
        }
    }
    public Person2 copyPerson(Person2 p){
        //创建一个新对象
        Person2 person2 = new Person2();
        person2.name = p.name;//把原来对象的名字赋值给新对象
        person2.age = p.age;//把原来对象的年龄赋值给新对象
        return person2;
    }
}
class Person2{
    String name;
    int age;
}


