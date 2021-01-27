package comAdvance.day01.demo5StringBuilder;

/*
    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class Stringbuilder1 {
    public static void main(String[] args) {

        StringBuilder bu1=new StringBuilder();
        System.out.println("bu1: "+bu1);

        StringBuilder bu2=new StringBuilder("abc");
        System.out.println("bu2: "+bu2);

        System.out.println("------------------");
          demo1();

        System.out.println("------------------");
        demo2();
    }

    /*
    *    public StringBuilder append(...)：
    * 添加任意类型数据的字符串形式，并返回当前对象自身。
     */
    private static void demo1(){

        StringBuilder bu1=new StringBuilder();
  /*      StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);   // 地址相同,同一对象
*/

        //       链式编程:方法返回值是一个对象,可以继续调用方法
        bu1.append("abc")
           .append(1)
           .append(true)
           .append(8.8);
        System.out.println(bu1);


        // reverse 反转
        bu1.reverse();
        System.out.println(bu1);

        StringBuilder sb=new StringBuilder("HelloWorldJava");
        sb.reverse();
        System.out.println(sb.toString());

    }


    /*
    StringBuilder和String可以相互转换:
        String->StringBuilder:可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder->String:可以使用StringBuilder中的toString方法
            public String toString()：将当前StringBuilder对象转换为String对象。
 */
    private  static  void demo2(){
        String str="hello";
        StringBuilder bu1=new StringBuilder(str);

        bu1.append("world");
        System.out.println("bu1: "+bu1);

        String s=bu1.toString();
        System.out.println("s: "+s);
    }
}
