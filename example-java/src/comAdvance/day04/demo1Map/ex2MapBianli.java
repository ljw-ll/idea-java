package comAdvance.day04.demo1Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex2MapBianli {
    public static void main(String[] args) {

         // demo1();    // 通过 Set<K> keySet()  遍历
        demo2();     // 通过Set<Map.Entry<K,V>> entrySet() 遍历
    }

    /*
    Map集合遍历的第二种方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */

    private static void demo2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);



        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key=entry.getKey();
            Integer val=entry.getValue();
            System.out.println(key+"->"+val);
      //      System.out.println(entry.getKey()+" "+entry.getValue());

        }

        System.out.println("-------------------");
        for (Map.Entry u:set){
            System.out.println(u.getKey()+" "+u.getValue());
        }
        System.out.println("-------------------");
        for (Map.Entry<String,Integer> u:set){
            System.out.println(u.getKey()+" "+u.getValue());
        }


    }

    /*
    Map集合的第一种遍历方式:通过键找值的方式
    Map集合中的方法:
         Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value
 */

    private static void demo1() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Set<String>  set=map.keySet();
        for(String u:set){
            System.out.println(u+"->"+map.get(u));
        }

        System.out.println("-----------------");
        System.out.println(map);
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
           String key=it.next();
            System.out.println(key+"->"+map.get(key));
        }

    }
}
