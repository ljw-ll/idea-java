package interface8;


/*
在任何版本的Java中，接口都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称(参数列表);

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2. 这两个关键字修饰符，可以选择性地省略。（今天刚学，所以不推荐。）
3. 方法的三要素，可以随意定义。
 */
public interface ex1MyInterface {

    //public static final 数据类型 常量名称 = 数据值;
   public static final int NUM_OF_CLass=10;
   int K=10;   // 可以省略关键字

    public abstract void myAbstract();

    // 这也是抽象方法
    abstract void methodAbs2();
    // 这也是抽象方法
    public void methodAbs3();
    // 这也是抽象方法
    void methodAbs4();

    //添加新的方法，为默认方法
    public default void methodDefault(){
        System.out.println("默认方法");
        common1();
    }

    public static void  methodStatic(){
        System.out.println("接口静态方法");
        common2();

    }

    //普通私有方法
    private  void common1(){
        System.out.println("aaa");
        System.out.println("bbb");
    }


   //静态私有方法
   private static  void common2(){
       System.out.println("staticaaa");
       System.out.println("staticbbb");
   }

}
