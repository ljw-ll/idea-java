package com.multi8;

/*
访问成员变量的两种方式：

1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。

 在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。

口诀：编译看左边，运行看右边。

对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。

 */
public class ex1 {
    public static void main(String[] args) {

        fu obj=new zi();
        obj.method();
        obj.methodFu();
        System.out.println("-----------------");

        System.out.println(obj.num);

        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
         obj.show();



    }
}
