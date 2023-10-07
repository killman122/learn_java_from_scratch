package com.hspedu.extend.improve;

import com.hspedu.extend.Graduate;
import com.hspedu.extend.Pupil;

public class Extend01 {
    public static void main(String[] args) {
        com.hspedu.extend.Pupil pupil = new Pupil();
        pupil.name = "小黄";
        pupil.setAge(18);
        pupil.testing();
        pupil.setScore(96);
        pupil.showInfo();

        com.hspedu.extend.Graduate graduate = new Graduate();
        graduate.name = "王道";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
