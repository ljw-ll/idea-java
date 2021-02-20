package comAdvance.day12.demo2Lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */
public class ex3Comparator {
    //定义一个方法,方法的返回值类型使用函数式接口Comparator
     public static Comparator<String> getComparator(){
        /* return new Comparator<String>() {
         @Override
             public int compare(String o1, String o2) {
                 //按照字符串的长度 降序排序
                 return o2.length()-o1.length();
             }  };*/

          /*   return (String o1,String o2)->{
                 return o2.length()-o1.length();
             };*/

         return (o1,o2)->o2.length()-o1.length();


     }

    public static void main(String[] args) {

         String[] arr={"aaa","bb","ccccccc"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));

    }
}
