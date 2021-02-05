package comAdvance.day06.demo2ThreadSafe;

public class Ticket implements Runnable {

    private  int ticket=100;
    @Override
    public void run() {

        while(true) {
            if (ticket > 0) {

                //提高安全问题出现的概率,让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ": 正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
