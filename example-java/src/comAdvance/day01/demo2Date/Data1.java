package comAdvance.day01.demo2Date;

import java.util.Date;

/*
    java.util.Date:表示日期和时间的类
    类 Date 表示特定的瞬间，精确到毫秒。
    毫秒:千分之一秒 1000毫秒=1秒
    特定的瞬间:一个时间点,一刹那时间
    2088-08-08 09:55:33:333 瞬间
    2088-08-08 09:55:33:334 瞬间
    2088-08-08 09:55:33:334 瞬间
    ...
    毫秒值的作用:可以对时间和日期进行计算
    2099-01-03 到 2088-01-01 中间一共有多少天
    可以日期转换为毫秒进行计算,计算完毕,在把毫秒转换为日期

    把日期转换为毫秒:
        当前的日期:2088-01-01
        时间原点(0毫秒):1970 年 1 月 1 日 00:00:00(英国格林威治)
        就是计算当前日期到时间原点之间一共经历了多少毫秒 (3742767540068L)
    注意:
        中国属于东八区,会把时间增加8个小时
        1970 年 1 月 1 日 08:00:00

    把毫秒转换为日期:
        1 天 = 24 × 60 × 60 = 86400 秒  = 86400 x 1000 = 86400000毫秒
 */
public class Data1 {
    public static void main(String[] args) {

        //获取当前系统时间到1970 年 1 月 1 日 00:00:00经历了多少毫秒
        System.out.println(System.currentTimeMillis());

        demo1();

        System.out.println("-------------");
        demo2();

        System.out.println("--------------");
        demo3();
    }

    /*
     * date 的空参数 构造方法
     * 获取当前系统的日期
     */
    private static  void demo1(){

        Date data=new Date();
        System.out.println(data);
    }

    /*
     *   date 的带参数 构造方法
     * Date（long data）
     * 传递毫秒值，把当前的毫秒值在转换为日期
     */

    private static  void demo2(){
        //基于 1970年1月1日8时0分0秒 进行 秒数添加 创建日期对象
        Date d1=new Date(0L);
        System.out.println(d1);

        Date d2=new Date(1611711226580L);
        System.out.println(d2.toString());
    }

   /*
    * date 类的成员方法
    * long geTime() 将日期转化为  毫秒
    */
   private  static  void demo3(){
        Date date=new Date();
        long time= date.getTime();
        System.out.println(time);

        Date d1=new Date(time);
        System.out.println(d1);

    }

}
