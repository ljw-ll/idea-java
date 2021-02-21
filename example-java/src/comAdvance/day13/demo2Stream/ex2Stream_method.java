package comAdvance.day13.demo2Stream;


import java.util.stream.Stream;

/*
          Stream流属于管道流,只能被消费(使用)一次
          第一个Stream流调用完毕方法,数据就会流转到下一个Stream上
          而这时第一个Stream流已经使用完毕,就会关闭了
          所以第一个Stream流就不能再调用方法了
          IllegalStateException: stream has already been operated upon or closed
       */
public class ex2Stream_method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
       // demo1(stream);     //  void forEach(Consumer<? super T> action);
      //  demo2(stream);    // Stream<T> filter(Predicate<? super T> predicate);

        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
      //  demo3(stream1);      // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

      //  demo4(stream1);     //  long count()

      //   demo5(stream1);    //  Stream<T> limit(long maxSize);

     //   demo6(stream1);     //  Stream<T> skip(long n);

     //  demo7(stream1,stream);   //  static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

    }


    /*
        Stream流中的常用方法_concat:用于把流组合到一起
        如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
        static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
     */
    private static void demo7(Stream<String> stream1, Stream<String> stream) {
      Stream.concat(stream,stream1)
             .forEach(u-> System.out.println(u));
    }


    /*
        Stream流中的常用方法_skip:用于跳过元素
        如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
        Stream<T> skip(long n);
            如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
     */
    private static void demo6(Stream<String> stream1) {
        stream1.skip(3)
                .forEach(u-> System.out.println(u));
    }

    /*
    Stream流中的常用方法_limit:用于截取流中的元素
    limit方法可以对流进行截取，只取用前n个。方法签名：
    Stream<T> limit(long maxSize);
        参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作
    limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 */
    private static void demo5(Stream<String> stream1) {
        stream1.limit(2)
                .forEach(u-> System.out.println(u));
    }


    /*
    Stream流中的常用方法_count:用于统计Stream流中元素的个数
    long count();
    count方法是一个终结方法,返回值是一个long类型的整数
    所以不能再继续调用Stream流中的其他方法了
 */
    private static void demo4(Stream<String> stream1) {
        long count = stream1.count();
        System.out.println(count);
    }


    /*
    Stream流中的常用方法_map:用于类型转换
    如果需要将流中的元素映射到另一个流中，可以使用map方法.
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
    Function中的抽象方法:
        R apply(T t);
 */
    private static void demo3(Stream<String> stream1) {
        stream1.map((String str)->{return Integer.parseInt(str);})
                .forEach(u-> System.out.println(u));
    }


    /*
        Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
        Stream<T> filter(Predicate<? super T> predicate);
        filter方法的参数Predicate是一个函数式接口,所以可以传递Lambda表达式,对数据进行过滤
        Predicate中的抽象方法:
            boolean test(T t);
     */
    private static void demo2(Stream<String> stream) {
        stream.filter(name->{return name.startsWith("张");})
              .forEach((u)-> System.out.println(u));
    }

    /*
    Stream流中的常用方法_forEach
    void forEach(Consumer<? super T> action);
    该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
    Consumer接口是一个消费型的函数式接口,可以传递Lambda表达式,消费数据

    简单记:
        forEach方法,用来遍历流中的数据
        是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法
 */
    private static void demo1(Stream<String> stream) {
        stream.forEach(name-> System.out.println(name));

    }



}
