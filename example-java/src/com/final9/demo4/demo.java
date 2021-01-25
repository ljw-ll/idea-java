package com.final9.demo4;

/*
* 匿名内部类
 */

public class demo {
    public static void main(String[] args) {
       MyInterface obj=new MyInterface() {
           @Override
           public void method1() {
               System.out.println("method1");
           }

           @Override
           public void method2() {
               System.out.println("method2");
           }
       };

       obj.method1();
       obj.method2();
    }
}
