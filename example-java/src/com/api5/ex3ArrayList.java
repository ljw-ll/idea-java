package com.api5;

import java.util.ArrayList;
import java.util.Arrays;


/*
数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容[...]。
如果内容是空，得到的是空的中括号：[]
 */
public class ex3ArrayList {
    public static void main(String[] args) {

      // 定长的数组对象
      //  creat();

        //ArrayList<E>中  <E>代表泛型，只能为引用类型，不能为基本类型
        //  泛型为 集合中 所有元素的类型
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list); // 输出不是地址值 ，而是[];
        add1(list);
        System.out.println(list);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);


        String name1=list.get(2);
        System.out.println("第2号索引位置："+name1);

        // 删除第2号 索引的元素
        String name2=list.remove(2);
        System.out.println("被删除的人："+name2);

        //集合长度
        System.out.println(list.size());


        //遍历集合
        forEach(list);

    }

    /*
     * 创建定长的对象数组
     */
    public static  void creat(){
        // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("玛尔扎哈", 38);

        // 将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println(Arrays.deepToString(array));
        System.out.println(array[1].getName());   // 古力娜扎
    }


    /*
     *  元素的添加
     */

    public static void add1(ArrayList<String> list){

        list.add("赵丽颖");
    }

   /*
    * 集合的遍历
    */
    public  static void forEach(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
