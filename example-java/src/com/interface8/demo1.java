package com.interface8;

public class demo1 {
    public static void main(String[] args) {
        ex1MyInterfaceImpl p=new ex1MyInterfaceImpl();
        System.out.println(ex1MyInterface.NUM_OF_CLass);
        p.myAbstract();
        p.methodAbs2();
        p.methodDefault();

        // 错误写法, 不能直接用对象调用 接口的静态方法；
       // p.methodStatic();
        // 通过接口名称 直接调用静态方法
        ex1MyInterface.methodStatic();
    }
}
