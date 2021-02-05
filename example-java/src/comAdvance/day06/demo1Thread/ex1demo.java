package comAdvance.day06.demo1Thread;

import javax.swing.plaf.TableHeaderUI;

/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2

         设置线程的名称:(了解)
        1.使用Thread类中的方法setName(名字)
            void setName(String name) 改变线程名称，使之与参数 name 相同。
        2.创建一个带参数的构造方法,参数传递线程的名称;调用父类的带参构造方法,把线程名称传递给父类,让父类(Thread)给子线程起一个名字
            Thread(String name) 分配新的 Thread 对象。

       public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
       毫秒数结束之后,线程继续执行
 */
public class ex1demo {
    public static void main(String[] args) {
      //  demo1();   // 获取线程名称
     //   demo2();     // 设置线程名称
      //  demo3();      // sleep()
        demo4();
    }


    /*
    匿名内部类方式实现线程的创建

    匿名:没有名字
    内部类:写在其他类内部的类

    匿名内部类作用:简化代码
        把子类继承父类,重写父类的方法,创建子类对象合一步完成
        把实现类实现类接口,重写接口中的方法,创建实现类对象合成一步完成
    匿名内部类的最终产物:子类/实现类对象,而这个类没有名字

    格式:
        new 父类/接口(){
            重复父类/接口中的方法
        };
 */

    private static void demo4() {

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"ljw");
                }
            }
        }.start();

       Runnable r= new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"程序猿");
                }
            }
        };
       new Thread(r).start();


       //  简化接口实现方式

        new Thread( new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"简便接口");
                }
            }
        }).start();



    }

    private static void demo3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i <60 ; i++) {
            System.out.println(i);
        }

    }


    private static void demo2() {

        MyThread mt=new MyThread("五彩");
        mt.start();

        MyThread mt1=new MyThread();
        mt1.setName("理财");
        mt1.start();
    }

    private static void demo1() {
        MyThread mt=new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
