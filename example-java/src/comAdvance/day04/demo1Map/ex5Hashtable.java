package comAdvance.day04.demo1Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层也是一个哈希表,是一个线程安全的集合,是单线程集合,速度慢
    HashMap:底层是一个哈希表,是一个线程不安全的集合,是多线程的集合,速度快

    HashMap集合(之前学的所有的集合):可以存储null值,null键
    Hashtable集合,不能存储null值,null键

    Hashtable和Vector集合一样,在jdk1.2版本之后被更先进的集合(HashMap,ArrayList)取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
public class ex5Hashtable {
    public static void main(String[] args) {

        HashMap<String,String> mp=new HashMap<>();
        mp.put(null,"a");
        mp.put(null,null);
        mp.put("b",null);
        System.out.println(mp);

        Hashtable<String,String> mp1=new Hashtable<>();
   //     mp1.put(null,"a");
   //     mp1.put(null,null);
   //     mp1.put("b",null);
        mp1.put("a","b");
        System.out.println(mp1);
    }
}
