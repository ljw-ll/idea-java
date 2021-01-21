package com.multi8.example;

import java.util.Comparator;

public class demo {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

        USB usb=new Mouse();
        computer.useService(usb);

        Keyboard keyboard=new Keyboard();
        computer.useService(keyboard);

        computer.powerOff();
    }
}
