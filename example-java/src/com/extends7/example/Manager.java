package com.extends7.example;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class Manager extends User {

    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //将 要发的total 总金额，分成count 份红包
    public ArrayList<Integer> send(int totalMoney,int count){

        //存红包金额的 集合
        ArrayList<Integer> arr=new ArrayList<>();

        //群主余额
        int leftMoney=super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return arr;
        }

        // 扣钱
        super.setMoney(leftMoney-totalMoney);

        //发红包
        int avg=totalMoney/count;
        int mod=totalMoney%count;

        for (int i = 0; i <count ; i++) {

            if(i==count-1){
                arr.add(avg+mod);
                continue;
            }
            arr.add(avg);
        }
        return arr;

    }

}
