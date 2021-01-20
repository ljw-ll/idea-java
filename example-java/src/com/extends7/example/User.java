package com.extends7.example;

import java.security.PrivilegedExceptionAction;

public abstract class User {
    private  String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //显示用户 钱数
    public void  show(){
        System.out.println("我叫"+name+" 有"+money+"元");
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
