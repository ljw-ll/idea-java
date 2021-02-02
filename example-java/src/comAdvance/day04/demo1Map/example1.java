package comAdvance.day04.demo1Map;

/*
    斗地主综合案例:有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */

import javax.tools.ForwardingFileObject;
import java.sql.SQLOutput;
import java.util.*;

public class example1 {
    public static void main(String[] args) {

        // 准备牌
        HashMap<Integer,String> poker=new HashMap<>();

        // 牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();

        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int index=0;

        poker.put(index,"大王");
        pokerIndex.add(index++);

        poker.put(index,"小王");
        pokerIndex.add(index++);

        for(String u:colors)
            for(String num:numbers){
                poker.put(index,u+num);
                pokerIndex.add(index++);
            }
        System.out.println(poker);

           // 洗牌
        Collections.shuffle(pokerIndex);
      //  System.out.println(pokerIndex);


         // 发牌
        ArrayList<Integer> play01=new ArrayList<>();
        ArrayList<Integer> play02=new ArrayList<>();
        ArrayList<Integer> play03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();

        for (int i = 0; i <pokerIndex.size() ; i++) {
            Integer u=pokerIndex.get(i);
            if(i>=51) {
                dipai.add(u);
            }else if(i%3==0){
                play01.add(u);
            }
            else if(i%3==1){
                play02.add(u);
            }
            else if(i%3==2){
                play03.add(u);
            }
        }

        // 排序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(dipai);

        //看牌
        lookPoker("王1",poker,play01);
        lookPoker("李1",poker,play02);
        lookPoker("张1",poker,play03);
        lookPoker("底牌",poker,dipai);


    }

     /*
        定义一个看牌的方法,提高代码的复用性
        参数:
            String name:玩家名称
            HashMap<Integer,String> poker:存储牌的poker集合
            ArrayList<Integer> list:存储玩家和底牌的List集合
        查表法:
             遍历玩家或者底牌集合,获取牌的索引
             使用牌的索引,去Map集合中,找到对应的牌
     */
    private  static void  lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){

        System.out.print(name+" ");

        for(Integer u:list){
            String val=poker.get(u);
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
