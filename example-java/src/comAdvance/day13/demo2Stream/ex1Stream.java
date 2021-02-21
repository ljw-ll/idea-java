package comAdvance.day13.demo2Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
    获取一个流非常简单，有以下几种常用的方式：
        - 所有的Collection集合都可以通过stream默认方法获取流；
            default Stream<E> stream()
        - Stream接口的静态方法of可以获取数组对应的流。
            static <T> Stream<T> of(T... values)
            参数是一个可变参数,那么我们就可以传递一个数组
 */
public class ex1Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> stream1 = set.stream();


        Map<String,String> mp=new HashMap<>();
        //获取键
        Set<String> keyset = mp.keySet();
        Stream<String> stream2 = keyset.stream();

        // 获取值
        Collection<String> values = mp.values();
        Stream<String> stream3 = values.stream();

        //获取键 值
        Set<Map.Entry<String, String>> entries = mp.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);

        Integer[] arr= {1,2,3,4,5};
        Stream<Integer> stream6 = Stream.of(arr);

        String[] arr2={"a","ab","abcccc"};
        Stream<String> stream7 = Stream.of(arr2);


    }
}
