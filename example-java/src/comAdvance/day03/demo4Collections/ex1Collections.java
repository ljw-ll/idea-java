package comAdvance.day03.demo4Collections;


/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        - public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
        - public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序。
 */

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class ex1Collections {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);

        Collections.shuffle(list);     // 随机乱序
        System.out.println(list);


     //   demo1();      // 默认 升序排序
         demo2();     //  自定义的 Person 类  实现  Comparable 接口 排序
        demo3();       // 使用Comparator  排序

    }

    private static void demo3() {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               // return o1-o2;    // 升序
                return o2-o1;      // 降序
            }
        });
        System.out.println(list01);
        System.out.println("-------------------");

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a迪丽热巴",18));
        list02.add(new Student("古力娜扎",20));
        list02.add(new Student("杨幂",17));
        list02.add(new Student("b杨幂",18));
        System.out.println(list02);

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()!=o2.getAge())
                return o1.getAge()-o2.getAge();

                else return o1.getName().charAt(0)-o2.getName().charAt(0);
            }
        });
        System.out.println(list02);
    }


    private static void demo2(){
        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",18));
        list03.add(new Person("李四",20));
        list03.add(new Person("王五",15));
        System.out.println(list03);//[Person{name='张三', age=18}, Person{name='李四', age=20}, Person{name='王五', age=15}]

        Collections.sort(list03);
        System.out.println(list03);
    }






    /*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */
    private static void demo1() {

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);//[1, 3, 2]

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Collections.sort(list01);//默认是升序
        System.out.println(list01);//[1, 2, 3]

    }
}
