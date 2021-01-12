package com.data1;

public class ex2Operator {

    public static void main(String[] args) {

        //   byte num=128;      超过byte范围报错

        //  demo1();
        demo2();
        demo3();
    }

    /*
     *
     */
    public static void demo1() {
        short s = 1;
        s += 1;    // 自带强制转换   s=(short)(s+1);
        System.out.println(s);

        short m=1;
    //    m=m+1;  报错

        short a = 5;
        short b = 8;
        //short +short --> int +int -->int
        // short ans=a+b;   //错误写法， 左侧需要int 类型

    }


    /*
     *对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，
     *那么javac编译器将会自动隐含地为我们补上一个(byte)(short)(char)。
     *1. 如果没有超过左侧的范围，编译器补上强转。
     *2. 如果右侧超过了左侧范围，那么直接编译器报错。
     */
    public static void demo2() {

        byte num1=30;
        // 实际上 编译器会补上  byte num1=(byte)30;
        System.out.println(num1);
    }


    /*   编译器的常量优化
     * 在给变量赋值时， 若右侧表达式 都是常量，没有任何变量
     * 那么编译器 javac 将会直接 将若干个 常量表达式 计算得到结果
     * short ans1=5+8; 编译后得到 的字节码 class 文件
     * 直接就是 short result=13;
     *
     * 但是注意：一旦表达式当中有变量参与，那么就不能进行这种优化了。
     */
    public static void demo3() {
        short a = 5;
        short b = 8;

        // short ans=a+b;   //错误写法， 左侧需要int 类型

        short ans1 = 5 + 8;
        System.out.println(ans1);
    }


}
