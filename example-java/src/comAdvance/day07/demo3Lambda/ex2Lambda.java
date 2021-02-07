package comAdvance.day07.demo3Lambda;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

// Lambda 表达式的练习
public class ex2Lambda {
    public static void main(String[] args) {

        //demo1();   //无参数、无返回值
     //   demo2();     //有参数有返回值 
        demo3();
    }

    /* Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
   */

    private static void demo3() {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

       invokeCalc(10,20,(int x,int y)->{
           return x+y;
       });
    }
    public static  void invokeCalc(int a,int b,Calculator cal){
        int sum=cal.calc(a,b);
        System.out.println(sum);
    }



    /*    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序

     */
    private static void demo2() {

        Person[] arr={
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19)
        };

        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
      /*  Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        

        for (Person p : arr) {
            System.out.println(p);
        }

    }


    /*
    需求:
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样

     */
    private static void demo1() {

     invokeCook(()->{
         System.out.println("吃饭了");
     });
    }

    //定义一个方法,参数传递Cook接口,
    // 方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }


}
