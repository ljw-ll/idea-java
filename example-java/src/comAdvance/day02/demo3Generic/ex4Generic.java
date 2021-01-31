package comAdvance.day02.demo3Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;

/*
泛型的通配符:
        ?:代表任意的数据类型
    使用方式:
        不能创建对象使用
        只能作为方法的参数使用
 */
public class ex4Generic {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);


        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("def");

        printf(list1);
        printf(list2);
    }

    /*
       定义一个方法,能遍历所有类型的ArrayList集合
       这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
       注意:
           泛型没有继承概念的
    */
    private static void printf(List<?> list) {
        Iterator<?> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    /*
    泛型的上限限定: ? extends E  代表使用的泛型只能是E类型的子类/本身
    泛型的下限限定: ? super E    代表使用的泛型只能是E类型的父类/本身
  */
    private static void demo2() {

        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
        //   getElement1(list2);//报错
        getElement1(list3);
        //   getElement1(list4);//报错

        //   getElement2(list1);//报错
        //  getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
    }

    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll) {
    }

    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll) {
    }

}
