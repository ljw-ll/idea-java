package comAdvance.day04.demo1Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class ex4LinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String,String> mp=new LinkedHashMap<>();
        mp.put("a","b");
        mp.put("c","c");
        mp.put("b","b");
        mp.put("d","m");
        System.out.println(mp);
    }
}
