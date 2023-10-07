package com.hspedu.encap;

import com.hspedu.modeifer.A;

public class AccountTest {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setSalary(60);
        account.setPassword("111111");
        account.showInfo();
    }

}
