package comAdvance.day03.demo1List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
public class ex2LinkedList {
    public static void main(String[] args) {

     //   demo1();   // 添加元素
     //   demo2();     // 获取元素的方法
         demo3();   // 移除元素的方法

    }

    private static void demo3() {
        LinkedList<String> linked=new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        String str= linked.removeFirst();
        System.out.println(str);;

        String str1=linked.removeLast();
        System.out.println(str1);

        System.out.println(linked);
    }

    private static void demo2() {
        LinkedList<String> linked=new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");

      //  linked.clear();
        if(!linked.isEmpty()) {
            System.out.println(linked);
            System.out.println(linked.getFirst());
            System.out.println(linked.getLast());
        }
    }

    private static void demo1() {
        LinkedList<String> linked=new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("kkk");
        System.out.println(linked);

        linked.push("lll");
        System.out.println(linked);

        linked.addLast("ccc");
        System.out.println(linked);

        linked.pop();
        System.out.println(linked);
    }
}
