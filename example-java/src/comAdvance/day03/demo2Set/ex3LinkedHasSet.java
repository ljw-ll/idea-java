package comAdvance.day03.demo2Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class ex3LinkedHasSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("aaa");
        System.out.println(set);   //[aaa, abc, www]  无序


        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("abc");
        set1.add("abc");
        set1.add("www");
        set1.add("aaa");
        System.out.println(set1);// [abc, www, aaa]  有序，按存入的 顺序

    }

}
