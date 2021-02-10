package comAdvance.day08.demo2Recursion;

import javax.swing.*;

public class ex1demo {
    public static void main(String[] args) {
        //   b(1);
        System.out.println(sum(10));
        System.out.println(jc(5));
    }
    /*
    练习:
        使用递归计算阶乘
        n的阶乘：n! = n * (n-1) *...* 3 * 2 * 1

 */
    private static long jc(long n){
        if(n==1)
            return 1;
        return n*jc(n-1);
    }

    /*
    练习:
        使用递归计算1-n之间的和
 */
    private static int  sum(int n) {
        if(n==1)
           return 1;
        return n+sum(n-1);

    }


    private static void b(int i) {
        System.out.println(i);
        //添加一个递归结束的条件,i==10000的时候结束
        if(i==12000){
            return;//结束方法
        }
        b(++i);
    }
}
