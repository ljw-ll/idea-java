package cn.reflect;

import cn.domain.Person;

/**
 获取Class对象的方式：
 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
 2. 类名.class：通过类名的属性class获取
 3. 对象.getClass()：getClass()方法在Object类中定义着。

 */
public class ex1demo {
    public static void main(String[] args) {

       // Class cls1 = Class.forName(cn.domain.Person);

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person p=new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        System.out.println(cls2==cls3);
    }
}
