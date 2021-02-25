package cn.reflect;

//	* 需求：写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "cn.domain.Person",methodName = "eat")
public class example2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        // 解析注解
        //1.1获取该类的字节码文件对象

        Class<example2> example2Class = example2.class;

        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        Pro an = example2Class.getAnnotation(Pro.class);
        /*
          public class ProImpl implements Pre{
               public String className(){
                    return "cn.itcast.annotation.Demo1";
                }
                public String methodName(){
                    return "show";
                }
          }
         */

        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);


        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();

        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);


    }
}
