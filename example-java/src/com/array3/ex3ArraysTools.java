package com.array3;

import java.util.Arrays;

public class ex3ArraysTools {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        print(arr1);

        int[] arr2={1,2,3,4,10};
        System.out.println(isSame(arr1,arr2));

        int[] arr3={5,3,10,8,9};
        Arrays.sort(arr3);
        print(arr3);

        /*
         *数组的复制，若 指定的 newlength 大于 复制的数组长度，则补0
         */
        int[] arr4=Arrays.copyOf(arr3,6 );
        print(arr4);

        /*
         * 数组的扩容，由 复制实现
         */
        int[] arr5={1,2,3,4,5,6};
        arr5=Arrays.copyOf(arr5,arr5.length+1);
        arr5[arr5.length-1]=(int)(Math.random()*12+1);  //随机赋值1 到 12
        print(arr5);

    }

    /*
     * Arrays.toString()
     * 打印数组
     */
    public static void print(int[] a){
        System.out.println(Arrays.toString(a));
    }

    /*
     * Arrays.equals(arr1,arr2)
     */
    public static boolean isSame(int[] a1,int[] a2){
        return Arrays.equals(a1,a2);
    }
}
