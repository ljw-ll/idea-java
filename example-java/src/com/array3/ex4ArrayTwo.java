package com.array3;

import java.util.Arrays;

/*
 * 二维数组
 */
public class ex4ArrayTwo {
    public static void main(String[] args) {
        //静态初始化
        int[][] a={{1,2,3},{4,5,6}};
   //     System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));

        //动态初始化
        int[][] arr1=new int[5][3];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                arr1[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(arr1));

        //遍历二维数组
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println("\n");
        }


        //三维数组
        int[][][] arr3=new int[5][4][3];

        int[][][] arr4={
                {{1,2},{3,4}},
                {{5,6},{7,8}}
        };



    }
}
