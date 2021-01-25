package com.final9.demo3;

public class demo {
    public static void main(String[] args) {
        Body body=new Body();
        body.methodBody();
        System.out.println("-------------");

        Body.Heart heart=new Body().new Heart();
        heart.beat();
        System.out.println("-------------");

        Outer obj=new Outer();
        obj.methodOuter();


    }
}
