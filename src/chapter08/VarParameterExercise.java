package chapter08;

public class VarParameterExercise {
    public static void main(String[] args) {
        /*
        有三个方法,分别实现了返回姓名和两门课程成绩(总分),返回姓名和其他三门课
        成绩(总分),返回姓名和五门课成绩(总分),封装成一个可变参数的方法
         */
        //类名HspMethod function:showScore
        HspMethod01 hspMethod01 = new HspMethod01();
        String info = hspMethod01.showCourse("王道",99,100,80,99,100);
        System.out.println(info);
    }
}

class HspMethod01{
    public String showCourse(String name,double... scores){
        double score = 0;
        for (int i = 0; i < scores.length; i++) {
            score += scores[i];
        }
        return "姓名"+name+scores.length+"门课程"+"课程的总成绩"+score;
    }
    public String showScore(String name,double a,double b){
        double score = 0;
        score = a + b;
        return "姓名"+name+"两门课程的总成绩是"+score;
    }
    public String showScore(String name,double a,double b,double c){
        double score = a + b + c;
        return "姓名"+name+"三门课程的总成绩是"+score;
    }
    public String showScore(String name,double a,double b,double c,double d,double e){
        double score = a + b + c + d +e;
        return "姓名"+name+"五门课程的总成绩是"+score;
    }
}
