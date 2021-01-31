package comAdvance.day02.demo3Generic;

public class ex3InterfaceDemo {
    public static void main(String[] args) {

        GenericInterfaceImpl1 gc1=new GenericInterfaceImpl1();
        gc1.method("接口泛型1");

        GenericInterfaceImpl2<Integer> gc2=new GenericInterfaceImpl2<>();
        gc2.method(1);

    }
}
