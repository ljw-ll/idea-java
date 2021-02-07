package comAdvance.day07.demo1Thread;

public class Person  extends Thread{

    private  Bz bz;
    String name;

    public Person(String name, Bz bz) {

        this.bz = bz;
        this.name = name;
    }

    @Override
    public void run() {

    while (true) {

        synchronized (bz) {
            if (bz.flag == false) {

                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name + "开始吃" + bz.pi + bz.xian + "的包子");
            System.out.println("------------");

            bz.flag = false;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bz.notify();

         }
      }
    }
}
