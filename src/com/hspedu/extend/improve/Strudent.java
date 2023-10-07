package com.hspedu.extend.improve;

//父类是pupil和Graduate的父类
public class Strudent {
    //两个子类共有的属性
    public String name;
    public int age;
    private double score;
    //子类共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
