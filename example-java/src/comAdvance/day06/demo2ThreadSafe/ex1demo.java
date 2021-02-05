package comAdvance.day06.demo2ThreadSafe;

/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
 */
public class ex1demo {
    public static void main(String[] args) {
       // demo(); // 安全问题
       // demo1();  // 同步代码块
     //   demo2();   // 同步方法
        demo3();    // 锁
    }

    private static void demo3() {
        Ticket3 ticket3=new Ticket3();

        Thread t1=new Thread(ticket3);
        Thread t2=new Thread(ticket3);
        Thread t3=new Thread(ticket3);

        t1.start();
        t2.start();
        t3.start();
    }

    private static void demo2() {
        Ticket2 ticket2=new Ticket2();

        Thread t1=new Thread(ticket2);
        Thread t2=new Thread(ticket2);
        Thread t3=new Thread(ticket2);

        t1.start();
        t2.start();
        t3.start();
    }

    private static void demo1() {
        Ticket1 ticket1=new Ticket1();

        Thread t1=new Thread(ticket1);
        Thread t2=new Thread(ticket1);
        Thread t3=new Thread(ticket1);

        t1.start();
        t2.start();
        t3.start();
    }


    private static void demo() {
        Ticket ticket=new Ticket();

        Thread t1=new Thread(ticket);
        Thread t2=new Thread(ticket);
        Thread t3=new Thread(ticket);

        t1.start();
        t2.start();
        t3.start();
    }

}
