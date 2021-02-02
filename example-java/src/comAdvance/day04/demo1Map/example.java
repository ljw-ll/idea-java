package comAdvance.day04.demo1Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/*
    练习:
        计算一个字符串中每个字符出现次数

    分析:
        1.使用Scanner获取用户输入的字符串
        2.创建Map集合,key是字符串中的字符,value是字符的个数
        3.遍历字符串,获取每一个字符
        4.使用获取到的字符,去Map集合判断key是否存在
            key存在:
                通过字符(key),获取value(字符个数)
                value++
                put(key,value)把新的value存储到Map集合中
            key不存在:
                put(key,1)
        5.遍历Map集合,输出结果
 */
public class example {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        HashMap<Character,Integer> mp=new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(mp.containsKey(c)){
                Integer val=mp.get(c)+1;
                mp.put(c,val);
            }else {
                mp.put(c,1);
            }
        }

        for(Character u:mp.keySet()){
            System.out.println(u+"->"+mp.get(u));
        }


    }
}
