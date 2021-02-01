package comAdvance.day03.demo2Set;

import com.multi8.example.USB;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */
public class ex1Set {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
        System.out.println("----------");
        for (Integer u:set){
            System.out.println(u);
        }

        System.out.println("--------------");

        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
