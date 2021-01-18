package com.object4;


public class ex3this {

    public static void main(String[] args) {

        Truck t=new Truck("宝马","red");
        t.run();

    }

}
class Truck {

    String brand;
    String color;
    int capacity;

    public Truck(String brand) {
        this.brand = brand;
    }

    public Truck(String brand, String color) {
        // 必须放在第一行
        this(brand);
        this.color = color;
    }

    public Truck(String brand, String color, int capacity) {
        // 必须放在第一行
        this(brand, color);
        this.capacity = capacity;
    }

    void startup() {
        System.out.println("启动!");
    }

    void speedUp() {
        System.out.println("加速!");
    }

    void stop() {
        System.out.println("刹车!");
    }

    void run() {
        // 通常,名称不冲突时,this可以省略.

        System.out.println("品牌:" + this.brand);
        System.out.println("颜色:" + this.color);
        System.out.println("载重:" + this.capacity);

        this.startup();
        this.speedUp();
        this.stop();
    }

}




