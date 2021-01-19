package com.api5;

import java.util.Arrays;

/*
 *java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

 *public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3...]）
 *public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。

 *备注：
 *1. 如果是数值，sort默认按照升序从小到大
 *2. 如果是字符串，sort默认按照字母升序
 *3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。（今后学习）
 */
public class ex6Arrays {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30};
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{5, 9, 6, 3, 2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        char[] ch1 = new char[]{'g', 'c', 's'};
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));


        String[] str1 = new String[]{"aaa", "bcd", "acm"};
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));

        demo1();

    }

    /*
     *题目：
     *请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
     */

    public static void demo1(){
        String str1="sabdobheonavnlvnwl";
        char[] ch1= str1.toCharArray();
        Arrays.sort(ch1);
        for (int  i = ch1.length-1;i>=0 ;i--) {
            System.out.print(ch1[i]);
        }
    }
}
