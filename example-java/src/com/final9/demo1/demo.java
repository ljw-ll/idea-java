package com.final9.demo1;

public class demo {
    public static void main(String[] args) {

        // 对于基本类型来说，不可变说的是变量当中的数据不可改变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可改变

        final  int num=10;
        // num=20;  错误不能改变
       // num=10;  错误，要保证有只能赋值一次


         final Fu f=new Fu();
        // f=new Fu();  错误
    }
}
