package comAdvance.day01.demo3Calendar;

import com.multi8.demo1.Cat;

import java.util.Calendar;
import java.util.Date;

public class calendar1 {
    public static void main(String[] args) {
        //    Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
        Calendar c=Calendar.getInstance();
        System.out.println(c);

        demo1(c);
        System.out.println("----------");
        demo2(c);

        System.out.println("----------");
        demo3(c);


        System.out.println("----------");
        demo4();
    }





    /*
     *    public int get(int field)：返回给定日历字段的值。
     */
    private static  void demo1(Calendar c){

        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);   // 西方默认 0-11 月

        int date=c.get(Calendar.DATE);
        int date1=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
        System.out.println(date1);

    }


    /*
    *   public void set(int field, int value)：
    * 将给定的日历字段设置为给定值。
     */
    private  static void demo2(Calendar c){

        c.set(Calendar.YEAR,999);
        c.set(Calendar.MONTH,9);

        // 同时设置
        c.set(888,8,8);

        demo1(c);
    }


    /*
    *  public abstract void add(int field, int amount)：
    * 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
     */

    private  static  void demo3(Calendar c){

        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-3);
        demo1(c);
    }

    /*
    *     public Date getTime()：
    * 返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
     */
    private  static  void demo4(){
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();
        System.out.println(date);

        System.out.println(date.toLocaleString());
    }

}
