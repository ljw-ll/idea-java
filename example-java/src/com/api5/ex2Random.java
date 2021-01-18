package com.api5;

import javax.swing.plaf.BorderUIResource;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ex2Random {
    public static void main(String[] args) {

      /*  Random r=new Random();
        int num=r.nextInt(1);
        System.out.println(num);*/

        game();

    }

    /*
     * 猜数字小游戏
     * 二分法查找(手动输入)

     */
    public static void game(){

        Scanner in=new Scanner(System.in);
        Random r=new Random();
        int num=r.nextInt(100);

      // int L=0,R=99,mid;
        int L,R,mid;
        while(true){
          //  mid=(L+R)>>1;
            mid=in.nextInt();

            if(mid==num){
                System.out.println("恭喜猜对了,结果是："+num);
                break;
            }
            else if(mid>num) {
             //   R = mid - 1;
                System.out.println("太大了");
            }
            else if(mid<num) {
             //   L = mid + 1;
                System.out.println("太小了");
            }

        }

    }
}
