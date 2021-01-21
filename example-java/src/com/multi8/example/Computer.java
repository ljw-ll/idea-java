package com.multi8.example;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    public void useService(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
            mouse.click();
        }
        if(usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;
            keyboard.type();
        }
        usb.close();
    }
}
