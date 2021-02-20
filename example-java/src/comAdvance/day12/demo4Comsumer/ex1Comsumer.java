package comAdvance.day12.demo4Comsumer;



import java.util.function.Consumer;

/*
    java.util.function.Consumer<T>接口则正好与Supplier接口相反，
        它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
    Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。

   Consumer接口是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型的数据
   至于具体怎么消费(使用),需要自定义(输出,计算....)
 */
public class ex1Comsumer {
    /*
       定义一个方法
       方法的参数传递一个字符串的姓名
       方法的参数传递Consumer接口,泛型使用String
       可以使用Consumer接口消费字符串的姓名
    */
    public  static void method(String name, Consumer<String> con){
        con.accept(name);
    }
    public static void main(String[] args) {
        method("ljw",(String name)->{
         //   System.out.println(name);

            // 翻转输出
            String rename=new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });

        method1("hello",
                (t)->{
                    System.out.println(t.toUpperCase());
                },
                (t)->{
                    System.out.println(t.toLowerCase());
                });
    }


    /*
   Consumer接口的默认方法andThen
   作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费

   例如:
    Consumer<String> con1
    Consumer<String> con2
    String s = "hello";
    con1.accept(s);
    con2.accept(s);
    连接两个Consumer接口  再进行消费
    con1.andThen(con2).accept(s); 谁写前边谁先消费
*/
    //定义一个方法,方法的参数传递一个字符串和两个Consumer接口,Consumer接口的泛型使用字符串
    public static void method1(String s,Consumer<String> con1,Consumer<String> con2){
      /*  con1.accept(s);
        con2.accept(s);*/
        // andthen
        con1.andThen(con2).accept(s);
    }
}
