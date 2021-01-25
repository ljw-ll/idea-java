package com.final9.demo3;

import javax.swing.plaf.ProgressBarUI;

/*
如何使用成员内部类？有两种方式：
1. 间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
2. 直接方式，公式：
类名称 对象名 = new 类名称();
外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */
public class Body {

    int num=10;
    public class Heart{

        int num=20;

        public void beat(){
            int num=30;
            System.out.println("心脏跳动");
            System.out.println("我叫：" + name); // 正确写法！
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }

    }

    private  String name;

    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
