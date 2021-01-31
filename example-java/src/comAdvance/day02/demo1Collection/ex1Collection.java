package comAdvance.day02.demo1Collection;

/*
 * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 * `public void clear()` :清空集合中所有的元素。
 * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 * `public boolean isEmpty()`: 判断当前集合是否为空。
 * `public int size()`: 返回集合中元素的个数。
 * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 */

import com.final9.demo3.Body;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ex1Collection {
    public static void main(String[] args) {

        Collection<String> arr=new ArrayList<>();

        arr.add("hello");
        arr.add("world");
        arr.add("java");
        System.out.println(arr);

    /*    boolean result=arr.remove("hello");
        System.out.println(result);
        System.out.println(arr);*/

   /*     arr.clear();
        System.out.println(arr);*/

        boolean re=arr.contains("java");
        System.out.println(re);

        System.out.println(arr.isEmpty());
        System.out.println(arr.size());

        Object[] arr1 = arr.toArray();
        System.out.println(Arrays.toString(arr1));


    }
}
