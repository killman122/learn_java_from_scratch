package com.hspedu.extend;

//大学生考试模拟
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {//和小学生pupil不一样
        System.out.println("大学生 " + name + "正在考高等数学");
    }
    public void showInfo(){
        System.out.println("学生名"+name+" 年龄"+age+" 成绩"+score);
    }

}
