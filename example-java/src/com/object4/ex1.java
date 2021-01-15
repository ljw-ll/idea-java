package com.object4;

import java.util.Objects;

public class ex1 {

    public static void main(String[] args) {
        Phone one=creat();
        method(one);

    }

    public static Phone creat(){
        Phone phone=new Phone();
        phone.brand="三星";
        phone.color="red";
        phone.price=12900;
        return phone;
    }

    public static void method(Phone param) {
        System.out.println(param.brand); // 苹果
        System.out.println(param.price); // 8388.0
        System.out.println(param.color); // 土豪金
    }

}
