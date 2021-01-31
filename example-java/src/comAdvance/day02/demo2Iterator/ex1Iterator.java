package comAdvance.day02.demo2Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口:迭代器(对集合进行遍历)
    有两个常用的方法
        boolean hasNext() 如果仍有元素可以迭代，则返回 true。
            判断集合中还有没有下一个元素,有就返回true,没有就返回false
        E next() 返回迭代的下一个元素。
            取出集合中的下一个元素
    Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
    Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

    迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class ex1Iterator {
    public static void main(String[] args) {

        Collection<String> coll=new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");

        // 迭代器Iterator
        demo1(coll);

        // 增强for循环
        demo2(coll);

    }

    private  static  void demo1(Collection<String> coll){
        Iterator<String> it= coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------");

        for (Iterator<String> it1= coll.iterator();it1.hasNext();){
            System.out.println(it1.next());
        }

    }

    /*
    增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
    是JDK1.5之后出现的新特性
    Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
    public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。

    增强for循环:用来遍历集合和数组

    格式:
            for(集合/数组的数据类型 变量名: 集合名/数组名){
        sout(变量名);
    }
 */

    private  static  void demo2(Collection<String> coll) {
        int[] arr=new int[]{2,4,6,8};
        for(int u:arr){
            System.out.println(u);
        }
        System.out.println("----------------");

        for(String u:coll){
            System.out.println(u);
        }


    }






}
