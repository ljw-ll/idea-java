package com.method;

public class ex1MethodDefine {
    public static void main(String[] args) {
        sum(10, 20);
        System.out.println(sum1());

        System.out.println(isSame(5,6));

        System.out.println(isSame(5,5));

    }

    /*
     * 求和
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum1() {
        int ans = 0;
        for (int i = 1; i < 100; i++) {
            ans += i;
        }
        return ans;
    }


    /*
     * 判断两个数是否一致
     */
    public static boolean isSame(int a, int b) {
       /*  boolean same=a==b? true:false;
         return same;*/
        return a==b;
    }
}
