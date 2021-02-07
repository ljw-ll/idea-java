package comAdvance.day07.demo1Thread;

import com.final9.demo1.Zi;

import javax.swing.plaf.BorderUIResource;
import java.util.Base64;

// 包子铺
public class Shop extends Thread{
    private  Bz bz;
    String name;

    public Shop(String name, Bz bz) {

        this.bz = bz;
        this.name = name;
    }

    @Override
    public void run() {
        int count=0;
        while (true) {

            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(name + "开始生产包子");
                if(count%2==0) {
                    bz.pi = "薄皮";
                    bz.xian = "牛肉";
                }else {
                    // 冰皮  五仁
                    bz.pi = "冰皮";
                    bz.xian = "五仁";
                }
                count++;
               bz.flag=true;

                bz.notify();

            }

        }
    }
}
