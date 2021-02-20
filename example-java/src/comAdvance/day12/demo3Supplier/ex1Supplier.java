package comAdvance.day12.demo3Supplier;


import java.util.function.Supplier;

/*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。

    Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 */
public class ex1Supplier {
    //定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }


    public static void main(String[] args) {
        //调用getString方法
        // 方法的参数Supplier是一个函数式接口,所以可以传递Lambda表达式
       String s=getString(()->{
        return "虎哥";
       });
        System.out.println(s);

        // 优化
        String s2=getString(()->"bbb");
        System.out.println(s2);

    }
}
