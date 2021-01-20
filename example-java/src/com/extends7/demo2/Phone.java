package com.extends7.demo2;

public class Phone {

    public Phone(){
        System.out.println("父类");
    }

    public Phone(int num){
        System.out.println("父类");
    }

    public void call(){
        System.out.println("打电话");
    }
    public void send(){
        System.out.println("发短信");
    }
    public void show(){
        System.out.println("显示号码");
    }
}
