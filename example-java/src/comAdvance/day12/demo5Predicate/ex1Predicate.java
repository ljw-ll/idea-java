package comAdvance.day12.demo5Predicate;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    作用:对某种数据类型的数据进行判断,结果返回一个boolean值

    Predicate接口中包含一个抽象方法：
        boolean test(T t):用来对指定数据类型数据进行判断的方法
            结果:
                符合条件,返回true
                不符合条件,返回false
*/
public class ex1Predicate {

    public static void main(String[] args) {
        String s="abcddd";
        boolean b = check(s, (String str) -> {
            if(str.length()>5) return  true;
            return false;
        });
        System.out.println(b);

        // 优化
        boolean b1 = check(s, str -> str.length() > 5);
        System.out.println(b1);


    }

     /*
        定义一个方法
        参数传递一个String类型的字符串
        传递一个Predicate接口,泛型使用String
        使用Predicate中的方法test对字符串进行判断,并把判断的结果返回
     */
    public static boolean check(String s, Predicate<String> pre){
        return pre.test(s);
    }


/*
    逻辑表达式:可以连接多个判断的条件
    &&:与运算符,有false则false
    ||:或运算符,有true则true
    !:非(取反)运算符,非真则假,非假则真

    方法内部的两个判断条件,也是使用&&运算符连接起来的   and
    方法内部的两个判断条件,也是使用||运算符连接起来的   or
     Predicate接口中有一个方法negate,也表示取反的意思！

 */
    public static boolean check1(String s,Predicate<String> pre1,Predicate<String> pre2){
        //return pre1.and(pre2).test(s);  //等价于return pre1.test(s) && pre2.test(s);
        //return pre1.or(pre2).test(s);   //等价于return pre1.test(s) || pre2.test(s);
        return pre1.negate().test(s);    //等效于return !pre.test(s);
    }




}
