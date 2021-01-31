package comAdvance.day02.demo3Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    斗地主综合案例:
        1.准备牌  定义一个存储54张牌的ArrayList集合,泛型使用String
        2.洗牌

            使用集合的工具类Collections中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。

        3.发牌    定义4个集合,存储玩家的牌和底牌
        4.看牌     打印输出
 */
public class example {
    public static void main(String[] args) {
        ArrayList<String> poker=new ArrayList<>();

        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker集合中

        poker.add("大王");
        poker.add("小王");

        // 组装牌
        for(String u:colors )
            for(String num:numbers){
                poker.add(u+num);
            }

     //   System.out.println(poker);
        /*
         *洗牌
         */
        Collections.shuffle(poker);
        //System.out.println(poker);

       /*
        *发牌
        * 共54张，最后底牌 留三张
        */
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for(int i=0;i<poker.size();i++){
            String c=poker.get(i);
            if(i>=51){
                dipai.add(c);
            }
            else if (i%3==0){
                player1.add(c);
            }
            else if (i%3==1){
                player2.add(c);

            }
            else if (i%3==2){
                player3.add(c);
            }
        }

        System.out.println("玩家1"+player1);
        System.out.println("玩家2"+player2);
        System.out.println("玩家3"+player3);
        System.out.println("底牌"+dipai);


    }
}
