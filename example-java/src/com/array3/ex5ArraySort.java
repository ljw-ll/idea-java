package com.array3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class ex5ArraySort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 4, 1, 5, 2};
//        Arrays.sort(arr);   //从小到大
//        System.out.println(Arrays.toString(arr));
        //bubbleSort1(arr);

        sort1(arr);


    }


    /*
     *冒泡排序
     */
    public static void bubbleSort1(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {         // 循环n-1次
            for (int j = 0; j < a.length - i - 1; j++) {
                //从大到小排序
                if (a[j + 1] > a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }


    /*
     *  自定义排序
     * 从大到小
     */

    public static void sort1(Integer[] a){

        Arrays.sort(a,new CompareMe() );
        System.out.println(Arrays.toString(a));
    }

    static class CompareMe implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {

                Integer a=(Integer)o1;
                Integer b=(Integer)o2;

                return a<b? 1:-1;

        }
    }

}
