package com.api5;


import java.util.Scanner;

public class ex1Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
       System.out.println(num);

        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int mx= Math.max(a,Math.max(b,c));
        System.out.println(mx);

        /*
        *使用匿名对象
         */
        System.out.println(new Scanner(System.in).nextInt());

    }
}
