package comAdvance.day04.demo1Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class ex3HashMap {
    public static void main(String[] args) {

       // demo1();
        demo2();
    }

    /*
       HashMap存储自定义类型键值
       key:Person类型
           Person类就必须重写hashCode方法和equals方法,以保证key唯一
       value:String类型
           可以重复
    */
    private static void demo2() {
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");

        Set<Person> set = map.keySet();
        for(Person u:set){
            System.out.println(u+"->"+map.get(u));
        }
    }





     /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
     */

    private static void demo1() {
        Map<String,Person> mp=new HashMap<>();
        mp.put("北京",new Person("张1",18));
        mp.put("上海",new Person("张2",18));
        mp.put("广州",new Person("李1",18));
        mp.put("北京",new Person("王1",18));

        System.out.println(mp);

        Set<String> set = mp.keySet();
        for(String u:set){
            Person val = mp.get(u);
            System.out.println(u+"->"+val);
        }
        System.out.println("---------------");

        Set<Map.Entry<String, Person>> entry= mp.entrySet();
        for(Map.Entry<String,Person>u:entry){
            System.out.println(u.getKey()+"->"+u.getValue());
        }

    }
}
