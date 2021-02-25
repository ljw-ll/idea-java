package cn.reflect;

import cn.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 Class对象功能：
 * 获取功能：
 1. 获取成员变量们
 * Field[] getFields()
 * Field getField(String name)

 * Field[] getDeclaredFields()
 * Field getDeclaredField(String name)
 2. 获取构造方法们
 * Constructor<?>[] getConstructors()
 * Constructor<T> getConstructor(类<?>... parameterTypes)

 * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * Constructor<?>[] getDeclaredConstructors()
 3. 获取成员方法们：
 * Method[] getMethods()
 * Method getMethod(String name, 类<?>... parameterTypes)

 * Method[] getDeclaredMethods()
 * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

 4. 获取类名
 * String getName()

 */

public class ex2demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
      // demo1();   // 获取成员变量
       demo2();   //  获取构造方法们
      //  demo3();    // 获取成员方法们：
    }
/*
3. 获取成员方法们：
 * Method[] getMethods()
 * Method getMethod(String name, 类<?>... parameterTypes)

 * Method[] getDeclaredMethods()
 * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

 */
    private static void demo3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class personClass = Person.class;

        Method eat_method = personClass.getMethod("eat");
        Person p=new Person();
        eat_method.invoke(p);

        Method  eat_method1= personClass.getMethod("eat", String.class);
        eat_method1.invoke(p,"饭");

        // 获取所有public 方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        //    method.setAccessible(true);
        }

        // 获取类名
        String name = personClass.getName();
        System.out.println(name);
    }

    /*
    2. 获取构造方法们
 * Constructor<?>[] getConstructors()
 * Constructor<T> getConstructor(类<?>... parameterTypes)

 * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * Constructor<?>[] getDeclaredConstructors()
     */
    private static void demo2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object p = constructor.newInstance("张三", 18);
        System.out.println(p);

        Constructor constructor1 = personClass.getConstructor();
        Object p1 = constructor1.newInstance();
        System.out.println(p1);

        Object o = personClass.newInstance();
        System.out.println(o);


    }


    /*
       1. 获取成员变量们
* Field[] getFields()
* Field getField(String name)

* Field[] getDeclaredFields()
* Field getDeclaredField(String name)
      */
    private static void demo1() throws NoSuchFieldException, IllegalAccessException {
        Class personClass = Person.class;


        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("----------");
        Field field = personClass.getField( "a");
        System.out.println(field);

        Person p=new Person();
        Object value = field.get(p);
        System.out.println(value);

        field.set(p,"张三");
        System.out.println(p);
        System.out.println("=============");

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field df : declaredFields) {
            System.out.println(df);
        }

        Field d = personClass.getDeclaredField("d");
        // 忽略访问权限修饰符
        d.setAccessible(true);  // 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);

        System.out.println(p);

    }

}
