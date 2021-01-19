package com.api5;

/*
 *java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

 *public static double abs(double num)：获取绝对值。有多种重载。
 *public static double ceil(double num)：向上取整。
 *public static double floor(double num)：向下取整。
 *public static long round(double num)：四舍五入。

 *Math.PI代表近似的圆周率常量（double）。
 */
public class ex7Math {
    public static void main(String[] args) {

        //绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-3));
        System.out.println(Math.abs(-0));
        System.out.println("------------------");

        //向上取整
        System.out.println(Math.ceil(1.5));
        System.out.println(Math.ceil(1.0));
        System.out.println(Math.ceil(-1.2));
        System.out.println("------------------");


        //向下取整
        System.out.println(Math.floor(1.5));
        System.out.println(Math.floor(1.0));
        System.out.println(Math.floor(-1.2));
        System.out.println("----------------");

        //四舍五入
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.2));
        System.out.println(Math.round(-1.2));
        System.out.println(Math.round(-1.7));
        System.out.println("---------------");

        System.out.println(Math.PI);
        System.out.println("---------------");


        demo1();

    }

    /*
     *题目：
     *计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
     */

    public static void demo1(){

        int num=0;
        double min=-10.8;
        double max=5.9;
        for(int  i=(int) min;i<=max;i++){
            int abs=Math.abs(i);
            if(abs>6||abs<2.1){
                num++;
            }
        }
        System.out.println(num);
    }
}
