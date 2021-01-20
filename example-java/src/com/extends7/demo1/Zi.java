package com.extends7.demo1;

public class Zi extends Fu{
    int numz=9;
    int num=200;
    public void methodz(){
        //本类有num ，用的是本来的num
        System.out.println("子类方法"+num);
    }
}
