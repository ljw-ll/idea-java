package comAdvance.day07.demo1Thread;

public class example {
    public static void main(String[] args) {

        Bz bz=new Bz();
        Person p1=new Person("张三",bz);
        Shop shop=new Shop("包子铺",bz);

        p1.start();
        shop.start();
    }
}
