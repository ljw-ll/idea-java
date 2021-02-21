package comAdvance.day13.demo3MethodReference;

import com.extends7.demo2.NewPhone;

import java.lang.reflect.Array;

/*
    数组的构造器引用
 */
public class ex5demo {
    public static void main(String[] args) {
        int[] arr = creatArray(10, (len) -> {
            return new int[len];
        });
        System.out.println(arr.length);


        int[] arr2 = creatArray(5, int[]::new);
        System.out.println(arr2.length);
    }

    /*   定义一个方法
        方法的参数传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
    public static  int[] creatArray(int length,ArrayBuilder ab){
        return ab.builderArray(length);

    }

}
