package cn.annotation;

public @interface MyAnno {
    int value();
    String name() default "张三";

    Person per();
    MyAnno2 anno2();
 //   String show2();




    String[] strs();
}
