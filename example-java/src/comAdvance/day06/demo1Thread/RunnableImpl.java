package comAdvance.day06.demo1Thread;

public class RunnableImpl implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
