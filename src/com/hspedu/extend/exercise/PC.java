package com.hspedu.extend.exercise;

public class PC extends Computer{
    public PC(String CPU, int memory, int hard_Disk, String brand) {
        super(CPU, memory, hard_Disk);//idea在生成构造函数时自动将要调用的构造器写在super()方法中
        this.brand = brand;
    }

    //体现出继承设计的基本思想:父类的构造器完成父类属性的初始化
    //子类的构造器完成子类属性的初始化
    //在创建PC类继承于Computer类时,在新创建的类的构造器中由于系统对于继承的类默认使用super()调用父类的无参构造器
    //由于无参构造器不存在所以只能手动修改构造器
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
     public void printInfo(){
         System.out.println("PC的信息=");
//         System.out.println(getCPU());//由于父类中CPU是一个私有的访问权限,所以在使用时直接调用父类的get|set方法,这些方法也被继承
         //调用父类的getDetails方法得到相关的属性
         System.out.println(getDetails()+" brand="+brand);
     }
}
