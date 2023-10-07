package com.hspedu.extend;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.setAge(10);
        pupil.testing();
        pupil.setScore(96);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "王道";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
