package comAdvance.day12.demo1FunctionalInterface;

public class ex1demo {
    //定义一个方法,参数使用函数式接口MyFunctionalInterface
    public static void show(MyfunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyfunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类，重写接口抽象方法");
            }
        });

        show(()->{
            System.out.println("Lambda表达式，重写接口抽象方法");

        });
    }
}
