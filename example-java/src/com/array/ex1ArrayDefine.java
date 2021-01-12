package com.array;

public class ex1ArrayDefine {
    public static void main(String[] args) {
        creat2();
    }

    /*
     *两种常见的初始化方式：
     * 动态初始化（指定长度）
     * 静态初始化（指定内容）
     */

    /*
     *动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的数据元素个数。
     * 数据类型[] 数组名字 = new 数据类型[长度];
     */

    public static void creat1() {
        int[] a = new int[100];
    }

    /*
     *静态初始化（指定内容）：在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定。
     * 数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2, ... };
     */

    public static void creat2() {
        int[] b = new int[]{1, 2, 3};

        //静态初始化的 省略格式
        int[] c = {1, 2, 3};

        System.out.println("数组长度："+c.length);
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i]);
        }

    }

    /*
     * 1. 静态初始化没有直接指定长度，但是仍然会自动推算得到长度。
     *2. 静态初始化标准格式可以拆分成为两个步骤。
     *3. 动态初始化也可以拆分成为两个步骤。
     *4. 静态初始化一旦使用省略格式，就不能拆分成为两个步骤了。
     */
    public static void creat3() {
        // 省略格式的静态初始化
        int[] arrayA = {10, 20, 30};

        // 静态初始化的标准格式，可以拆分成为两个步骤
        int[] arrayB;
        arrayB = new int[]{11, 21, 31};

        // 动态初始化也可以拆分成为两个步骤
        int[] arrayC;
        arrayC = new int[5];

        // 静态初始化的省略格式，不能拆分成为两个步骤。
       int[] arrayD;
//        arrayD = { 10, 20, 30 };   // 报错
    }


}
