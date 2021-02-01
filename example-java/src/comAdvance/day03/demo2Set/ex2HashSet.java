package comAdvance.day03.demo2Set;



/*
    哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
    在Object类有一个方法,可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值。
    hashCode方法的源码:
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */

import java.util.HashSet;

public class ex2HashSet {
    public static void main(String[] args) {

       //   demo1();    // 哈希值 hasCode();
     //  demo2();  // Set集合不允许存储重复元素的原理:  需要重写hasCode()和equals();
       demo3();   // 存自定义元素


    }

    /*
    HashSet存储自定义类型元素
    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法
    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */
    private static void demo3() {
        HashSet<Student> set=new HashSet<>();
        Student s1=new Student("小王",20);
        Student s2=new Student("小王",20);
        Student s3=new Student("小王",19);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(set);

    }

    private static void demo2() {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }

    private static void demo1() {
        Person p1=new Person();
        // 重写Person 类 的  hasCode()方法
        System.out.println(p1.hashCode());
        System.out.println(p1.toString());

        Person p2=new Person();
        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println("------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);//false

        /*
            String类的哈希值
                String类重写Obejct类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
