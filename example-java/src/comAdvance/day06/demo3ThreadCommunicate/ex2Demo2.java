package comAdvance.day06.demo3ThreadCommunicate;

/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class ex2Demo2 {
    public static void main(String[] args) {


        Object obj=new Object();

        // 顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒只有一个执行
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // 唤醒后执行
                        System.out.println("顾客1包子开吃");
                        System.out.println("--------------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒只有一个执行
                    synchronized (obj) {
                        System.out.println("顾客2告知老板要的包子的种类和数量");

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // 唤醒后执行
                        System.out.println("顾客2包子开吃");
                        System.out.println("--------------------------");
                    }
                }
            }
        }.start();

        //老板线程
        new Thread(){
            @Override
            public void run() {

                while (true) {
                    // 花5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    synchronized (obj) {
                        System.out.println("老板5秒钟之后做好包子,告知顾客,可以吃包子了");

                       // obj.notify();
                        obj.notifyAll();
                    }
                }
            }
        }.start();

    }
}
