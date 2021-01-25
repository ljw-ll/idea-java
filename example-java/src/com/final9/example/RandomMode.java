package com.final9.example;

import com.final9.example.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        ArrayList<Integer> list=new ArrayList<>();
        // 随机分配
        //最少1分，最多不超剩下平均数的二倍

        Random r=new Random();

        int leftMoney=totalMoney;
        int leftCount=totalCount;

        //随机发n-1 个，最后一个是确定的
        for (int i = 0; i < totalCount-1; i++) {

            int money=1+r.nextInt(leftMoney/leftCount*2);
            leftMoney-=money;
            leftCount--;
            list.add(money);
        }
        list.add(leftMoney);

        return list;
    }
}
