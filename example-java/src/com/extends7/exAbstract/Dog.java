package com.extends7.exAbstract;

public class Dog extends Animal {

    public Dog(){
        //super();   默认会有
        System.out.println("子类构造");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");

    }
}
