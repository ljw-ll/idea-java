package comAdvance.day01.demo4System;

import java.util.Arrays;

/*
    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
        public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
 */
public class system1 {

    public static void main(String[] args) {
       demo1();
        System.out.println("----------");
        demo2();
    }

    /*
     * public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
     * 测试程序效率
     */
    private static void demo1() {

        long s=System.currentTimeMillis();
        for(int i=1;i<=9999;i++)
            System.out.println(i);
        long e=System.currentTimeMillis();
        System.out.println("程序共耗时"+(e-s)+"毫秒");
    }

    /*
    * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
    * 将数组中指定的数据拷贝到另一个数组中。
     */

    /*
    将src数组中前3个元素，
    复制到dest数组的前3个位置上复制元素前：src数组元素[1,2,3,4,5]，
    dest数组元素[6,7,8,9,10]复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
    private static void demo2(){

        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.out.println("复制前"+ Arrays.toString(src));

        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后"+ Arrays.toString(dest));

    }

}

