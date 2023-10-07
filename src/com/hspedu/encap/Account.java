package com.hspedu.encap;

public class Account {
    //为了封装将class的所有属性更改为private
    private String name;
    private double salary;
    private String password;

    //提供两个构造器,一个为无参构造器,一个是有参构造器包含三个参数
    public Account() {
    }

    public Account(String name, double salary, String password) {
//        this.name = name;
//        this.salary = salary;
        //this.password = password;//这种不使用set方法约束,会使得数据的混乱
        this.setName(name);
        this.setSalary(salary);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求在长度2-4之间");
            this.name = "王道";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 20) {
            this.salary = salary;
        } else {
            System.out.println("余额必须大于20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6)
            this.password = password;
        else {
            System.out.println("密码必须是6位,默认密码是123456");
            this.password = "123456";
        }
    }

    //显示账号信息
    public void showInfo() {
        System.out.println("账号信息 name=" + name + " 余额" + salary + " 密码" + password);
    }
}
