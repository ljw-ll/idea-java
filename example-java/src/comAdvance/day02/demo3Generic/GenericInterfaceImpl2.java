package comAdvance.day02.demo3Generic;

/*
    含有泛型的接口第二种使用方式:接口使用什么泛型,实现类就使用什么泛型,类跟着接口走
    就相当于定义了一个含有泛型的类,创建对象的时候确定泛型的类型
    public interface List<E>{
        boolean add(E e);
        E get(int index);
    }
    public class ArrayList<E> implements List<E>{
        public boolean add(E e) {}
        public E get(int index) {}
    }
 */
public class GenericInterfaceImpl2<E> implements GenericInterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
