package comAdvance.day02.demo3Generic;

import java.util.Objects;

public class ex2GenericDefine {
    public static void main(String[] args) {

       // demo1();     //泛型的简单使用

      //  demo2();   // 泛型方法的使用

    }

    private  static  void demo1(){
        //不写泛型，默认为 Object型
        Generic gc=new Generic();
        gc.setName("字符串");
        Object obj=gc.getName();
        System.out.println(obj);
        System.out.println("----------");

        //创建GenericClass对象,泛型使用Integer类型
        Generic<Integer> gc1=new Generic<>();
        gc1.setName(11);
        System.out.println(gc1.getName());

    }


    /*
     * 泛型 方法的测试
     */
    private  static  void demo2(){
       Generic gc=new Generic();
       gc.method1(1);
       gc.method1("abc");

       // 泛型的静态方法
       Generic.method2("hhh");
    }


}
