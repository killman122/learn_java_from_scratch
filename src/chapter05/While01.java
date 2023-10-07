package chapter05;

/*
打印1-100之间的所有能被三整除的数(使用while)

打印40-200之间的所有的偶数(使用while)
 */

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Number_Divisible_By_Three.number_divisible_by_three();
        Number_Divisible_By_Three.number_divisible_by_two();
    }
}

class Number_Divisible_By_Three{
    static void number_divisible_by_three(){
        for (int i = 1; i <=100 ; i++) {
            while (i%3 ==0){
                System.out.println(i);
            }
        }
    }

    static void number_divisible_by_two(){
        for (int i = 40; i <=200 ; i++) {
            while (i%2 ==0){
                System.out.println(i);
            }
        }
    }
}
