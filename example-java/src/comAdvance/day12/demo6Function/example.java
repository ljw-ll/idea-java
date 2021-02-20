package comAdvance.day12.demo6Function;

import java.util.function.Function;

/*
    练习：自定义函数模型拼接
    题目
    请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
        String str = "赵丽颖,20";

    分析:
    1. 将字符串截取数字年龄部分，得到字符串；
        Function<String,String> "赵丽颖,20"->"20"
    2. 将上一步的字符串转换成为int类型的数字；
        Function<String,Integer> "20"->20
    3. 将上一步的int数字累加100，得到结果int数字。
        Function<Integer,Integer> 20->120
 */
public class example {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int ans = change(str, s -> s.split(",")[1],
                s -> Integer.parseInt(s) + 100);

        System.out.println(ans);
    }
    public static int change(String s, Function<String,String> fun1,
                             Function<String,Integer> fun2){
        //使用andThen方法把三个转换组合到一起
        return fun1.andThen(fun2).apply(s);
    }
}
