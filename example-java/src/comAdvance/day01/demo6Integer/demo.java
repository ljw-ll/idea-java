package comAdvance.day01.demo6Integer;

import java.util.ArrayList;

/*
装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        构造方法:
            Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
        静态方法:
            static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
    拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        成员方法:
            int intValue() 以 int 类型返回该 Integer 的值。
 */
public class demo {
    public static void main(String[] args) {

        Integer integer = new Integer(1);//方法上有横线,说明方法过时了
        System.out.println(integer);

        Integer integer1 = new Integer("1");
        System.out.println(integer1);
        // 静态方法
        Integer integer2 = Integer.valueOf(1);
        System.out.println(integer2);


     /*   //NumberFormatException数字格式化异常
        Integer integer3 = Integer.valueOf("a");
        System.out.println(integer3);
      */


        //拆箱 intValue()
        int i = integer.intValue();
        System.out.println(i);

        System.out.println("---------");
        demo1();

    }
    /*
     *  自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
     *JDK1.5之后出现的新特性
     */
    private static  void demo1(){
        Integer in1=10;
        System.out.println(in1);

          /*
            自动拆箱:in是包装类,无法直接参与运算,可以自动转换为基本数据类型,在进行计算
            in+2;就相当于 in.intVale() + 2 = 12
            in = in.intVale() + 2 = 12 又是一个自动装箱
         */
        in1=in1+2;
        System.out.println(in1);

        ArrayList<Integer> list = new ArrayList<>();
        /*
            ArrayList集合无法直接存储整数,可以存储Integer包装类
         */
        list.add(1); //-->自动装箱 list.add(new Integer(1));

        int a = list.get(0); //-->自动拆箱  list.get(0).intValue();
    }
}
